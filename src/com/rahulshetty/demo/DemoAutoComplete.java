package com.rahulshetty.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoAutoComplete {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
		driver.manage().window().maximize();
		
		Actions action= new Actions(driver);
		WebElement mulColorField = driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"));
		
		action.click(mulColorField);
		action.sendKeys("re").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
		System.out.println("HeLLO");
	}

}
