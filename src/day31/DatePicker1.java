package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/01/2021");
		// //MM/DD/YYYY

		// using login
		String year = "2028";
		String month = "September";
		String date = "18";

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		while (true) 
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (mon.equals(month) && yr.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // NEXT

		}

		// capture date
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement ele : allDates)
		{
			String dt = ele.getText();
			if (dt.equals(date)) 
			{
				ele.click();
				break;
			}
		}

	}
}
