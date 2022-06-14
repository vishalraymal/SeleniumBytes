package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {

	public static void main(String argsp[]) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // Maximize the browser

		/*
		 * driver.findElement(By.id("search_query_top")).sendKeys("T-Shirt");
		 * driver.findElement(By.name("search_query")).click(); //
		 * driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		 * driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		 */

		List<WebElement> slides = driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders: " + slides.size());

		// Find the number of Links on the page
		List<WebElement> nLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: " + nLinks.size());

		// Total number of images on the page
		List<WebElement> noImg = driver.findElements(By.tagName("img"));
		System.out.println("Number of images: " + noImg.size());

		driver.quit();

	}

}
