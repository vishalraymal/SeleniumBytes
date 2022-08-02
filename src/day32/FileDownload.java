package day32;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {
	public static void main(String[] args) {
		String location = System.getProperty("user.dir") + "\\DownloadFiles";
		
		//Chrome
	/*	HashMap hm= new HashMap();
		hm.put("download.default_directory", location);
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
		options.setExperimentalOption("prefs", hm);
		System.setProperty("webdriver.chrome.driver", "D:/WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);   */
		
		//Firefox
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2); // 0-Desktop, 1- Download, 2- Desired Location
		profile.setPreference("browser.download.dir", location );
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv");  //mime-type "application/octet-stream" <-Universal
		profile.setPreference("pdfjs.disabled", true); // To disable download message confirmation
		profile.setPreference("browser.download.manager.showWhenStarting",false);  // To disable download message confirmation
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		System.setProperty("webdriver.gecko.driver", "D://WebDrivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		
				
		driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'][normalize-space()='CSV'])[1]")).click();

	}

}
