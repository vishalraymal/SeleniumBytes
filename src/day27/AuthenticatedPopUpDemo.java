package day27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUpDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//http://username:password@test.com
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
