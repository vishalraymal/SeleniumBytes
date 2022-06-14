package com.rahulshetty.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D://WebDrivers//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
