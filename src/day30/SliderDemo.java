package day30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
	   //option.addArguments("--headless");
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		
		WebElement min_slider= driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of min slider: "+min_slider.getLocation());  //59, 259
		
		act.dragAndDropBy(min_slider, 100, 0).build().perform();
		System.out.println("Location of min slider after moving: "+ min_slider.getLocation());
		
		WebElement max_slider= driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of min slider: "+max_slider.getLocation()); 
				
		act.dragAndDropBy(max_slider, -18, 0).build().perform();
		System.out.println("Location of max slider after moving: "+max_slider.getLocation()); 


		
	}

}
