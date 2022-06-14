package defPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		// driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizen')]")).click();
		/*
		 * System.out.println(driver.findElement(By.xpath(
		 * "//input[contains(@id,'FamilyAndFriends')]")).isSelected());
		 * System.out.println(driver.findElement(By.xpath(
		 * "//input[contains(@id,'SeniorCitizen')]")).isSelected());
		 */
		// Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'FamilyAndFriends')]")).isSelected());
		// Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizen')]")).isSelected());
		// System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		/*
		 * driver.findElement(By.xpath("//input[1][@id='custom_date_picker_id_1']")).
		 * click(); Thread.sleep(1000);
		 * driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click
		 * (); System.out.println("This is sucessful");
		 * driver.findElement(By.xpath("//input[1][@id='custom_date_picker_id_2']")).
		 * click(); Thread.sleep(1000);
		 */
		System.out.println(driver.findElement(By.xpath("//input[1][@id='custom_date_picker_id_2']")).isEnabled());
		driver.findElement(By.xpath("//input[contains(@id,'InputSearchView_RoundTrip')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[1][@id='custom_date_picker_id_2']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//div[@id='marketDate_2']")).getAttribute("style"));
		if (driver.findElement(By.xpath("//div[@id='marketDate_2']")).getAttribute("style").contains("0.5")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
