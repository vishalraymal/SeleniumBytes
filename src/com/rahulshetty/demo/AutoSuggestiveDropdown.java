package com.rahulshetty.demo;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
      
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	//	WebDriverWait myWait= new WebDriverWait(driver, Duration.ofMillis(15000));
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		
		String cityName= "Australia";
		Thread.sleep(3000);
	
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement option : options)

		{
					
		   if (option.getText().equalsIgnoreCase("Austria"))
			{
			  jse.executeScript("arguments[0].click()", option);
			   
              option.click();
			} 
     	}  
	}
}
