package defPack;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle()); // Validate your page Title
		String URL = driver.getCurrentUrl(); // Validate if you are landed on correct URL
		System.out.println(URL);
		// String pageSource =driver.getPageSource(); // we can see page source by this
		// System.out.println(pageSource);
		driver.get("https://yahoo.com");
		driver.navigate().back();
		driver.close(); // This will close current window
		driver.quit(); // This will close all windows opened by selenium

	}

}
