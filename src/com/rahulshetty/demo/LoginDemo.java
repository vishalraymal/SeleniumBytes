package com.rahulshetty.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	/*	System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		WebDriverWait mywait = new WebDriverWait(driver, 10);  // explicit wait declaration
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
	    //Enter username		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
		
		//Enter password and click User radio btn
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
	
	//	WebElement popOkay = driver.findElement(By.xpath("//button[@id='okayBtn']"));
		// Use Explicit wait for this pop message to appears
		WebElement popOkay = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		if(popOkay.isDisplayed())
		{
			popOkay.click();
		}
		
		WebElement selElement = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select se = new Select(selElement);
		se.selectByValue("consult");
		
		driver.findElement(By.id("terms"));
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		
		*/
	}

}
