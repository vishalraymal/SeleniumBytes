package defPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s = new Select(driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		s.selectByValue("5");
		s.selectByIndex(6);
		s.selectByVisibleText("4");

	}

}
