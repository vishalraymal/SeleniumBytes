package com.rahulshetty.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPracto {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.practo.com/");
	
	//click on doctor search
	driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']")).click();
	
	//click on pune and clear it.
	driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-locality' and @placeholder='Search location']")).clear();
	
	//send banglore
	driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-locality' and @placeholder='Search location']")).sendKeys("Banglore");
	
	
}
}
