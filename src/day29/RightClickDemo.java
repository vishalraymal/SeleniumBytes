package day29;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		// Right click operations
		Actions action = new Actions(driver);
		action.contextClick(button).build().perform();   // contextClick-- Right click
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		
		driver.	quit();
		
		
		
		
		
	}

}
