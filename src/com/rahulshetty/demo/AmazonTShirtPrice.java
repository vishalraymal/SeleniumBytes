package com.rahulshetty.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTShirtPrice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("t shirt for men full sleev stylish");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		List<WebElement> itemCost = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@aria-hidden]/span[2]")));
	/*	for(WebElement eachItemCost : itemCost)
		{
			String s= eachItemCost.getText();
			int i=0;
			do 
			{
				System.out.println("Item cost : "+s);
				i++;
			}while(i>3);  
		
				
		} */
		
		for(int i=1; i < itemCost.size() ; i++)
		{
				if(i<=3)
				{
					System.out.println(i+" Item cost : "+itemCost.get(i).getText());
				}
			
		}
			
			
		
		
		
		
		
	}
	

}
