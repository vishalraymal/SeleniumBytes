package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:/RahulShetty/VISHAL_RahulNote.txt");
		
		driver.quit();
	}

}
