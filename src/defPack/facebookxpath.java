package defPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");

		// XPATH : //tagName[@Attribute='value']
		/*
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "HelloFacebook");
		 * driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */

		// CSS : tagName[Attribute='value']
		// tagName#id : CSS, tagName.className : CSS - Both can be combine use
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("this is my css");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// xpath/following::sibling::[l2]
		// xpath/parent:ui

	}

}
