package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		String month="Feb";
		String year="2023";
		String date ="26";
		
		Select seYear= new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
		seYear.selectByVisibleText(year);
				
		Thread.sleep(5000);
		Select seMonth = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
		seMonth.selectByVisibleText(month);
		
		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele : allDates)
		{
			String dt = ele.getText();
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
			
			
		}
	
		
		
		
		
	}
}
