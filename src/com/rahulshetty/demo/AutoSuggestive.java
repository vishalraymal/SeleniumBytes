package com.rahulshetty.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestive {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.united.com/en/us/website-search");
		driver.findElement(By.cssSelector("#inputAutosuggestModel")).sendKeys("RE");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(
				By.xpath("//ul[@id='inputAutosuggestModel-menu'] //li[contains(@id,'inputAutosuggestMode')]"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("refund")) {
				option.click();
				break;
			}

		}

	}

}
