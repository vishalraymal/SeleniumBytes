package com.rahulshetty.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class E2E_UI_Handling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();

		// Select travel cities
		driver.findElement(
				By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(
				By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT"))
				.click();
		driver.findElement(By.xpath("//a[@value='AGR']")).click();
		// Thread.sleep(500);

		// Explicit wait
	//	WebDriverWait w = new WebDriverWait(driver, 5);
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'ui-state-default')]")));

		// select current date from calendar
		// driver.findElement(By.xpath("//div[@id='ui-datepicker-div']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default')]")).click();

		// select no. passengers
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Select noAdult = new Select(driver.findElement(By.cssSelector(
				"#ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		noAdult.selectByIndex(6);

		/*
		 * Select noChild = new Select(driver.findElement(By.xpath(
		 * "//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']"
		 * ))); noChild.selectByValue("3");
		 */

		Select noInfant = new Select(driver.findElement(By.cssSelector(
				"#ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
		noInfant.selectByVisibleText("2");

		// Check other calendar option is disabled or enabled
		if (driver.findElement(By.xpath("//div[@id='marketDate_2']")).getAttribute("style").contains("0.5")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Find the no. check box present on page and select senior citizen
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizen')]")).click();
		System.out.println("No of checkboxes :" + driver.findElements(By.xpath("//*[@type='checkbox']")).size());

		// Click on search button
		driver.findElement(By.cssSelector(".bookbtn")).click();

	}

}
