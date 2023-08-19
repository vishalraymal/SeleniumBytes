package day29;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions action = new Actions(driver);
		
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy= driver.findElement(By.id("box106"));
		
		action.dragAndDrop(rome, italy).build().perform();
		
		
		
		
	}

}
