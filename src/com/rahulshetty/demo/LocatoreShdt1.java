import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatoreShdt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implicit wait 5 seconds timeout

		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=b7Q70PrY3vYDOCIAf5UMzsNQiiPe6YzD6bbRayGUIOovsGQJEhzhKuHyLwLgqrFApihB4Nrg-ydXX8lK7k1cXg");
		driver.findElement(By.id("email")).sendKeys("Shahadat");
		driver.findElement(By.name("password")).sendKeys("123455");
		driver.findElement(By.className("btn-primary")).click();
//		System.out.println(driver.findElement(By.className("bodySmall")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		
		driver.findElement(By.linkText("Forgot Password")).click();
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("khanshahadat459@gmail.com");
		System.out.println("Hello selenium");
//		driver.findElement(By.cssSelector("input#email")).sendKeys("khanshahadat459@gmail.com");
//		driver.findElement(By.cssSelector("input[type=submit]")).click();
//		<div class="bodySmall m-b-3-xs text-center-xs auth-flash-error">
//	      Your email or password is incorrect.
//	  </div>
		
		
	}

}