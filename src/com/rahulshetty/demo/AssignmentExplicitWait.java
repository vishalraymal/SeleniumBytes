package com.rahulshetty.demo;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		String[] mobiles = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		WebDriverWait ewt = new WebDriverWait(driver, Duration.ofSeconds(5)); // for explict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // ---------- Implicit wait
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		ewt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		driver.findElement(By.cssSelector("select[class='form-control']")).click();
		WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select option = new Select(dropdown);
		option.selectByIndex(2);
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		ewt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Shop Name')]")));
		addItems(driver, mobiles);
	}

	public static void addItems(WebDriver driver, String[] mobiles) {

		// List<WebElement> models =
		// driver.findElements(By.xpath("//h4[@class='card-title']/a"));
		List<WebElement> models = driver.findElements(By.cssSelector("h4.card-title"));
		for (int i = 0; i < models.size(); i++) {
			WebElement name = models.get(i);
			String formattedName = name.getText();
//			System.out.println(models.get(i).getText());
			List<String> itemsNeededList = Arrays.asList(mobiles);
			if (itemsNeededList.contains(formattedName)) {

				System.out.println(formattedName);

			}

		}

	}

}