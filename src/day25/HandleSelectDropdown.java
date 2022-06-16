package day25;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		// 1. By using select class
		WebElement drpCountryElement = driver.findElement(By.xpath("//select[@name='country_id']"));
		Select drpCountry = new Select(drpCountryElement);
		
		// Select options from dropdown
		drpCountry.selectByVisibleText("Bangladesh");
		drpCountry.selectByValue("223");
		drpCountry.selectByIndex(2); // albania will get selected as index start from 0
		
		// Find the number of country
		List<WebElement> opt = drpCountry.getOptions();
		int totalNumOfOption = opt.size();
		System.out.println("Number of country : "+ totalNumOfOption);	
		
		// capture all option and print them
	/*	for(int i=0; i <totalNumOfOption; i++)
		{
			String optText = opt.get(i).getText();
			System.out.println("Option "+i+" : "+optText);
		}  */
		
		for(WebElement optEle : opt)
		{
			
			System.out.println(optEle.getText());
			
		}
	}

}
