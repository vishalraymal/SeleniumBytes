package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TabAndWindowDemo {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		// option.addArguments("--headless");
		option.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");

		// In selenium4, we use following command
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.orangehrm.com/");

		driver.switchTo().newWindow(WindowType.WINDOW); //this will open another browser
		driver.get("https://www.aurusinc.com");

	}

}
