package defPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("myusername");
		driver.findElement(By.cssSelector("#password")).sendKeys("nothing");
		driver.findElement(By.cssSelector("input[name='Login']")).click();

	}
}
