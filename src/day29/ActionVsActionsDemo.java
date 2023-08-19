package day29;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActionsDemo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		// Right click operations
		Actions action = new Actions(driver);
	 //	action.contextClick(button).build().perform();   // contextClick-- Right click
		
		Action myAction = action.contextClick(button).build(); // here we are storing created action into variable
		myAction.perform();  // we are creating and performing action stored above
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	}

}
