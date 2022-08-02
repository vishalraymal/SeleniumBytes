package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String month= "December";
		String date="11";
		String year="1990";
		
		while(true)
		{
			String mt = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(mt.equals(month) && yr.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele : allDates)
		{
			String dt= ele.getText();
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
			
		}
		
		
		
		
	}

}
