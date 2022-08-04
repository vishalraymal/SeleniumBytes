package day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser", "url"})
	public void setUp(String br, String url)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:/WebDrivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:/WebDrivers/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:/WebDrivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get(url);
	}

	@Test(priority=1)
	public void testLogo()
	{
		try {
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		Boolean status =logo.isDisplayed();
		Assert.assertTrue(status);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test(priority=2)
	public void testTitle()
	{
		String title= driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM", "Title is not expected...");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
