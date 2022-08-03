package day37;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://demo.nopcommerce.com/login");		
	}
	
	@Test(dataProvider="dp")
	public void testLogin(String user, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		String title= driver.getTitle();
		Assert.assertEquals(title, "nopCommerce demo store", "Title not matched...");

	}
	
	@DataProvider(name="dp", indices= {1,2})
	String[][] loginData()
	{
		String[][] data = {
				{"test@testadmin.com","admin123"},
				{"test@test.admin","admin4123"},
				{"pavanoltraining@gmail.com","test3"},
				{"pavanoltraining@gmail.com","test@123"},
				{"pavanoltraining@gmail.com","test@123"}
		     };
	return data;
    }
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
