package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TabAndWindowDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
	   //option.addArguments("--headless");
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
		
		/*// In selenium4, we use following command
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.switchTo().newWindow(WindowType.WINDOW);
		 */
	}

}
