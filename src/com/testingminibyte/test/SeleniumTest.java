package com.testingminibyte.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String welcome_msg= driver.findElement(By.xpath("//a[@id='welcome']")).getText();
		System.out.println("Welcome message="+welcome_msg);
		if(welcome_msg.equals("Welcome Paul"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		driver.quit();
	}
}
