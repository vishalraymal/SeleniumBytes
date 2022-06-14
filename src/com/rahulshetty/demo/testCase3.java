package com.rahulshetty.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vishalramraymal@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("shpsryad89");
		// driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"))
				.click();

	}

}
