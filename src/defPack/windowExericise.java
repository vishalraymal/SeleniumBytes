package defPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowExericise {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles(); // ParentID, Child ID
		Iterator<String> it = window.iterator();
		String ParentID = it.next();
		String ChildID = it.next();

		driver.switchTo().window(ChildID);
		String textResult = driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(textResult);
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];
		driver.switchTo().window(ParentID);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);

	}
}
