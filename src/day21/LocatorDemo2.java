package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		// Css selector and tag-id and id only #
		// driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("T-Shirt");
		// driver.findElement(By.cssSelector("#search_query_top")).sendKeys("T-Shirt");

		// cssSelector tag and className OR only className .
		// driver.findElement(By.cssSelector("input.search_query")).sendKeys("T-Shirt");
		// driver.findElement(By.cssSelector(".search_query")).sendKeys("T-Shirt");

		// Attribute and name
		// driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("T-Shirt");
		// driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("T-Shirt");

		// tag class and attribute
		// driver.findElement(By.cssSelector("input.search_query[placeholder='Search']")).sendKeys("T-Shirt");
		driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("T-Shirt");

	}

}
