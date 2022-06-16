package day25;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1. Select specific checkbox
	//	driver.findElement(By.id("monday")).click();
		
		//2. Find out total number of checkbox
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		System.out.println("Number of checkboxes :"+ checkboxes.size());
	
		//3. How to select checkboxes
		
		/*	for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}  */
		
	    for(WebElement chkBox : checkboxes)
		{
			chkBox.click();
		}  
		
		//4. Last two checkboxes
	/*	for(int i=5; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click(); 
		}  */
		
		//5. Select first to checkboxes
		/*
		  for(int i=0; i < 2; i++)
		  {
		   checkboxes.get(i).click(); 
		  }  */
		
		// 6. clear/un-checked the checkboxes
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
		
		
		//driver.quit();
		
		
	}
}
