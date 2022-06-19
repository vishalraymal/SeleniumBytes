package day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowerWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowIDs= driver.getWindowHandles();
		
		// Approach 1
	/*	List<String> windowIDList = new ArrayList<>(windowIDs);  //covert set to list collection
		String parentWindow = windowIDList.get(0);
		String childWindow = windowIDList.get(1);
		driver.switchTo().window(childWindow);
		System.out.println("Child Window Title : "+ driver.getTitle());
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title : "+ driver.getTitle());  */
		
		//Approach 2 (Using Looping statement)
		for(String windowID: windowIDs)
		{
			String title= driver.switchTo().window(windowID).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS"))
			{
				driver.findElement(By.xpath("//a[normalize-space()='Contact Sales']")).click();
			}
		}
		
		Thread.sleep(10000);
		driver.quit();
		
		
	}

}
