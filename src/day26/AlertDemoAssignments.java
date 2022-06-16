package day26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemoAssignments {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("abcdddd");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String alertMsg= driver.switchTo().alert().getText();
		System.out.println("ALERT MESSAGE: "+ alertMsg);
		
		
	}

}
