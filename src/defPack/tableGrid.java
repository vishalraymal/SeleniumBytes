package defPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableGrid {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D://WebDrivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/38112/ind-vs-afg-33rd-match-super-12-group-2-icc-mens-t20-world-cup-2021");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.xpath("//div[@id='innings_2']/div[1]"));
		int runCount = table.findElements(By.xpath(
				"//div[@id='innings_2']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-right text-bold']"))
				.size();

		int sum = 0;
		for (int i = 0; i < runCount; i++) {
			String s = table.findElements(By.xpath(
					"//div[@id='innings_2']/div[1]/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-right text-bold']"))
					.get(i).getText();
			int intValue = Integer.parseInt(s);
			sum = sum + intValue;
		}
		System.out.println("Total runs are made by players : " + sum);

		String extraRUN = table.findElement(By.xpath(
				"//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[contains(.,'Extras')]/following-sibling::div[1]"))
				.getText();
		System.out.println(extraRUN);
		String TotalRUN = table.findElement(By.xpath(
				"//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-bold text-black text-right']"))
				.getText();
		System.out.println(TotalRUN);
		System.out.println("dONE");

	}

}
