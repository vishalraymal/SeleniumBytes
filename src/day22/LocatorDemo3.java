package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {
	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		// absolute XPATH
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-Shirt");
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();

		// Relative XPATH
		// driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-Shirt");
		// driver.findElement(By.xpath("//button[@name='submit_search']")).click();

		// OR operator
		// driver.findElement(By.xpath("//input[@id='search_query_top' or
		// @name='search_query']")).sendKeys("T-Shirt");
		// driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn
		// btn-default button-search']")).click();

		// AND operator
		// driver.findElement(By.xpath("//input[@id='search_query_top' and
		// @name='search_query']")).sendKeys("T-Shirt");
		// driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn
		// btn-default button-search']")).click();

		// contains() method
		// driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("T-Shirt");
		// driver.findElement(By.xpath("//button[contains(@name,'search')]")).click();

		// starts-with() method
		// driver.findElement(By.xpath("//input[starts-with(@id,'search')]")).sendKeys("T-Shirt");
		// driver.findElement(By.xpath("//button[starts-with(@name,'submit')]")).click();

		// XPATH--- text() method
		// driver.findElement(By.xpath("//a[text()='Women']")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();

		// chained xpath // followed by //

		// driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("T-Shirt");
		// driver.findElement(By.xpath("//form[@id='searchbox']//button[@type='submit']")).click();

	}

}
