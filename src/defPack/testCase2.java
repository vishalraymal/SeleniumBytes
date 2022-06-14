package defPack;

import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {
	public static void main(String[] args) {
		/*
		 * Key value of driver- Chrome : webdriver.chorme.driver FireFox:
		 * webdriver.gecko.driver ie= webdriver.ie.driver edge= webdriver.edge.driver
		 */

		System.setProperty("webdriver.gecko.driver", "D://WebDrivers//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
