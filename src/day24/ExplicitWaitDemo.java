package day24;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitDemo {
	public static void main(String[] args) 	
	{
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER); //in some mac keyboard RETURN also there
		
		
		//usage
		try {
		WebElement lnkWeb=  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
		lnkWeb.click();
		}
		catch(Exception e)
		{
			System.out.println("Element not found...");
		} 
		
		
		
		
		
		
	}

}
