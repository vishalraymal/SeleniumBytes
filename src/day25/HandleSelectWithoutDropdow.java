package day25;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectWithoutDropdow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://www.opencart.com/index.php?route=account/register");
	
		//capture all the options and print them
		List<WebElement> allOptions= driver.findElements(By.xpath("//select[@name='country_id']/option"));
		
		// Size of Options
		System.out.println("Number of options :" + allOptions.size());
		
		// print all options
	/*	for(int i=0; i< allOptions.size(); i++)
		{
			String s = allOptions.get(i).getText();
			System.out.println("Option "+i+" "+s);
			
		} */
		
		// select Yemen country
		for(WebElement optionEle : allOptions)
		{
			String s = optionEle.getText();
			if(s.equals("Yemen"))
			{
				optionEle.click();
			}
		}
		
		
	}

}
