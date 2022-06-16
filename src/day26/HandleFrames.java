package day26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
	
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		// First Frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();  // go back to main page
		
		// Second Frame
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver' and @class='interfaceName']")).click();
		driver.switchTo().defaultContent(); // go back to main page
		
		Thread.sleep(5000);
		
		// Third Frame
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		
	}

}
