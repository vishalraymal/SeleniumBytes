package com.rahulshetty.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D://WebDrivers//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
