package day41;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrokenLinkDemo {

	WebDriver driver;

	@BeforeClass()
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
	}

	@Test
	void brokenLinkTest() throws IOException   {
		// Step1: Capture all the links
		// Step2: Capture href attribute
		// step3: if href attribue does not have value, then ignore
		// step4: if href have value then connect to server using value(URL)
		// step5: if error code <400 then it is not broken link and if error code is
		// >400 then it is broken link

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: " + links.size());
		int brokenLinks = 0;
		for (WebElement e : links) {
			String url = e.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			try {
			URL link = new URL(url);
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.connect(); // connect to server
			if (httpConn.getResponseCode() >= 400) {
				System.out.println(url + " broken link");
				brokenLinks++;
			} else {
				System.out.println(url + " not a broken link");
				brokenLinks++;
			}
			}
			catch(Exception xe) {
				xe.printStackTrace();
			}
		}
		
		System.out.println("Number of broken link : "+ brokenLinks);
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
