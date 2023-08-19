package day29;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement desktop = driver.findElement(By.xpath("//li[@class='nav-item dropdown']/a[text()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//li/a[text()='Mac (1)']"));
		
		// Mouse Hover
		Actions act = new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
		
		
		System.out.println("END");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
