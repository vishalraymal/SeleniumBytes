package day29;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActionDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		driver.switchTo().frame("iframeResult");
		
		// Double click 
		WebElement field_one = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement btnCopyText = driver.findElement(By.xpath("//button"));
		
		field_one.clear();
		String s= "Vishal Raymal";
		field_one.sendKeys(s);
		
		Actions action = new Actions(driver);
		action.doubleClick(btnCopyText).build().perform();  // double click
		
		String s2 = driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");	
		System.out.println("Field2 : "+ s2);
		if(s2.equals("Vishal Raymal"))
		{
			System.out.println("Field1 and Field2 texts are matched...");
		}
		else
		{
			System.out.println("Field1 and Field2 texts are not matched...");

		}
		
		
		
		
		
		
		
	}
	
	
	
}
