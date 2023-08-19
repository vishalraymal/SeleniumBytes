package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		//1. Scroll down by pixel number
	/*	js.executeScript("window.scrollBy(0,3000)", "");
		long value= (Long) js.executeScript("return window.pageYOffset");
		System.out.println("Pixel of the page: "+ value);  */
		
		
		//2. scroll down by certain element found
	/*	WebElement flag= driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0].scrollIntoView();", flag);
		long value= (Long) js.executeScript("return window.pageYOffset");
		System.out.println("Pixel of the page: "+ value);  */
		
				
		//3. scroll down till end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		long value= (Long) js.executeScript("return window.pageYOffset");
		System.out.println("Pixel of the page: "+ value);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Go back to initial page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		long value1= (Long) js.executeScript("return window.pageYOffset");
		System.out.println("Pixel of the page: "+ value1);
		
		
		driver.quit();
		
		
		
	}
	

}
