package com.rahulshetty.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSelectStateGP 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		WebElement selectState = driver
				.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder' and contains(text(),'State')]"));
		Actions action = new Actions(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		long value = (Long) js.executeScript("return window.pageYOffset");
		System.out.println("Pixel of the page: " + value);

		Robot robot = new Robot();
		Thread.sleep(5000);
		System.out.println("About to zoom out");
		for (int i = 0; i < 6; i++) 
		{
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		action.click(selectState);
		action.click();
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();

		System.out.println("VISHAL R");
	}

}
