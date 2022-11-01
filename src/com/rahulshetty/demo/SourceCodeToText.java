package com.rahulshetty.demo;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceCodeToText {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		String source_code = driver.getPageSource();
		
		FileWriter fw = new FileWriter("D:\\git_pavan\\SeleniumBytes\\src\\day25\\data.txt");
		fw.write(source_code);
		fw.close();
		driver.close();
		driver.quit();
	}

}
