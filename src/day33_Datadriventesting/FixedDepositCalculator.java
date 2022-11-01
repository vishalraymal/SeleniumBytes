package day33_Datadriventesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String path= "D:\\RahulShetty\\caldata.xlsx";
		
		int rows= XLUtils.getRowCount(path, "data");
		
		
		for(int r=1; r<=rows;r++)
		{
			//Read data from excel
			String principal= XLUtils.getCellData(path, "data", r, 0);
			String ROI = XLUtils.getCellData(path, "data", r, 1);
			String period_one= XLUtils.getCellData(path, "data", r, 2);
			String period_two= XLUtils.getCellData(path, "data", r, 3);
			String freq = XLUtils.getCellData(path, "data", r, 4);
			String maturity_value= XLUtils.getCellData(path, "data", r, 5);
			
					
			//pass above values to application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principal);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(ROI);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period_one);
			
			Select select_period = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			select_period.selectByVisibleText(period_two);
			
			
			Select select_freq = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			select_freq.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//div[@class='CTR PT15']/a[1]/img")).click();
			
			String actual_maturity_value = driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
			
			if(Double.parseDouble(actual_maturity_value)==Double.parseDouble(maturity_value))
			{
				System.out.println("test passed");
				XLUtils.setCellData(path, "data", r,7, "its pass...");
				XLUtils.fillGreenColor(path, "data", r,7);
			}
			else
			{
				System.out.print("test failed");
				XLUtils.setCellData(path, "data", r,7, "opps its fail...");
				XLUtils.fillRedColor(path, "data", r,7);
			}
			
			driver.findElement(By.xpath("//div[@class='CTR PT15']/a[2]/img")).click();
			
				
		}	
			
			
		
	}

}
