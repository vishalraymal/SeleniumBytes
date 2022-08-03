package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase 
{
	WebDriver driver;
	
	@Test(priority=1)
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		
	}

	@Test(priority=2)
	public void login()
	{
		WebElement email= driver.findElement(By.xpath("//input[@name='Email']"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
		password.clear();
		password.sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String loginDashboard= driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		Assert.assertEquals(loginDashboard, "Dashboard","Labels are not equals..");
	}
	
	@Test(priority=3)
	public void closeApp()
	{
		driver.quit();
	}
}

