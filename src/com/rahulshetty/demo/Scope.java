package com.rahulshetty.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scope {
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "D://WebDrivers//Chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "D://WebDrivers//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		// 1. Give the count of links on the page
		int LinksCount = driver.findElements(By.xpath("//a")).size();
		System.out.println("Number of Links : " + LinksCount);

		// 2. Links from footer section
		WebElement footerDriver = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println("Number of Links in footer : " + footerDriver.findElements(By.tagName("a")).size());

		// 3. Links from first column
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int firstColumnLink = columnDriver.findElements(By.tagName("a")).size();
		System.out.println("Number of Links from first column :" + firstColumnLink);

		// 4.Click on each link from first column
		for (int i = 1; i < firstColumnLink; i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);

		}
		Thread.sleep(5000L);
		Set<String> noTabs = driver.getWindowHandles();
		Iterator<String> it = noTabs.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("Title of Window :" + driver.getTitle());
		}

	}

}
