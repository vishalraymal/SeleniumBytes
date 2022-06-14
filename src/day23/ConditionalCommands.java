package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		WebElement searchBox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		// check isDisplayed
		System.out.println("Search box : "+ searchBox.isDisplayed());
		// check isEnabled
		System.out.println("Enabled box :"+ searchBox.isEnabled());
		// check isSelected
		WebElement btnRadioMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement btnRadioFmle = driver.findElement(By.xpath("//input[@id='gender-female']"));
		//Before selecting radio buttion
		System.out.println("Before Selection : Male Radio: "+btnRadioMale.isSelected()+" --- Female Radio: "+btnRadioFmle.isSelected());
		//After selection male radio buttion
		btnRadioMale.click();
		System.out.println("Before Selection : Male Radio: "+btnRadioMale.isSelected()+" --- Female Radio: "+btnRadioFmle.isSelected());
	    //Navigation commonds
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
