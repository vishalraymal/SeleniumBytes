package day24;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait {
	public static void main(String[] args) throws InterruptedException  	
	{
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// for its presence every 5 seconds
		// Declaration of Fluent Wait
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))	
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER); //in some mac keyboard RETURN also there
		
		// Usage of Fluent Wait
		WebElement lnkWeb =mywait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver arg0) 
			{
				return driver.findElement(By.xpath("//h3[text()='Selenium']"));
			}
			
		});
		lnkWeb.click();
		
		
		
		
	}

}
