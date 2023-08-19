package com.revision.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER); //in some mac keyboard RETURN also there
		
		
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		driver.quit();
	}

}
