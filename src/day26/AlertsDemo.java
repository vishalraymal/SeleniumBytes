package day26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alertwindow= driver.switchTo().alert();
		
		// Capture the text
		String alertText = alertwindow.getText();
		System.out.println("Alert window text : "+alertText);
		
		// Pass value in the 
		alertwindow.sendKeys("Hello VISHAL..");
		
		//alertwindow.accept();
		
		alertwindow.dismiss();
		
		
		
		
	}

}
