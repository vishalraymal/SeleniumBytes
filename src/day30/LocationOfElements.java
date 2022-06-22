package day30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocationOfElements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
	    option.addArguments("--headless");
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Point poc = driver.findElement(By.xpath("//div[@id='divLogo']/img")).getLocation();
		
		System.out.println("Position of POC WebElement: "+poc);
		System.out.println("X-axis value: "+poc.getX());
		System.out.println("Y-axis value: "+poc.getY());
		
	}

}
