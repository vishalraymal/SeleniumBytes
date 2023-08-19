package day27;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUpDemo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@actualWebSite.com
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.quit();
	}

}
