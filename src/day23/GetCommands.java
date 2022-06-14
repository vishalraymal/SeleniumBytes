package day23;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); // Open URL on the browser
		String title = driver.getTitle(); // Return the title of current page
		System.out.println("Title of the page: " + title); // return the title of current page
		String url = driver.getCurrentUrl(); // return current open url
		System.out.println("Current URL is: " + url);
		// String pSource = driver.getPageSource(); //
		// System.out.println("Page source is---> "+ pSource); // return page source
		String windowID = driver.getWindowHandle(); // Return single window browser id
		System.out.println("Browser window id: " + windowID);
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		/*
		 * for(String winid : windowIDs) // return multiple browser windowIDs {
		 * System.out.println(winid); }
		 */
		Iterator<String> Itr = windowIDs.iterator();

		driver.quit();

	}

}
