package day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindowAssignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

		
		driver.findElement(By.cssSelector("input.wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Search elements
		WebElement searchFirst= driver.findElement(By.xpath("//a[normalize-space()='Selenium']"));
		WebElement searchSecond= driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']"));
		WebElement searchThird= driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']"));
		WebElement searchFourth= driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']"));
		WebElement searchFifth= driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']"));
		
		//click of search elements
		searchFirst.click();
		searchSecond.click();
		searchThird.click();
		searchFourth.click();
		searchFifth.click();
		
		System.out.println("Defualt page title : "+driver.getTitle());
		
		Set<String> windowIds = driver.getWindowHandles();
		List<String> listWinIds	= new ArrayList<>(windowIds);
		
		System.out.println("Size of window : "+ listWinIds.size());
		
		String firstWindID = listWinIds.get(0);
		String secondWindID = listWinIds.get(1);
		String thirdWindID = listWinIds.get(2);
		String fourthWindID = listWinIds.get(3);
		String fifthWindID = listWinIds.get(4);
		String sixthWindID = listWinIds.get(4);

		//Get Title of first window
		System.out.println("Title of first window : "+driver.getTitle());
		
		// Get Title of second window
		driver.switchTo().window(secondWindID);
		System.out.println("Title of second window : "+ driver.getTitle());
		driver.switchTo().window(firstWindID);
		
		// Get Title of third window
		driver.switchTo().window(thirdWindID);
		System.out.println("Title of third window : "+driver.getTitle());
		driver.switchTo().window(firstWindID);
		
		// Get Title of forth window
		driver.switchTo().window(fourthWindID);
		System.out.println("Title of fourth window : "+driver.getTitle());
		driver.switchTo().window(firstWindID);
		
		// Get Title of fifth window
		driver.switchTo().window(fifthWindID);
		System.out.println("Title of Fifth window : " + driver.getTitle());
		driver.switchTo().window(firstWindID);

		// Get Title of sixth window
		driver.switchTo().window(sixthWindID);
		System.out.println("Title of sixth window : " + driver.getTitle());
		driver.switchTo().window(firstWindID);
		
	}

}
