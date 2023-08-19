package day26;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(10000);
		List<WebElement> searchEle = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']"));
		
		// print search option
		for(WebElement opt: searchEle)
		{
			System.out.println(opt.getText());
		}
		
		// select selenium testing option
		
		for(WebElement opt1 : searchEle)
		{
			if(opt1.getText().equals("selenium testing"))
			{
				opt1.click();
				System.out.println("Selenium Testing is Selected..");
				break;
			}
		}
	}
	
	
	

}
