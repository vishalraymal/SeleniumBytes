package defPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://WebDrivers//Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);

		System.out.println("Number of iFrame " + driver.findElements(By.tagName("iframe")).size());

		// Frame search using webelement
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

		// Drag and Drop
		Actions a = new Actions(driver);
		WebElement source1 = driver.findElement(By.cssSelector("#draggable"));
		WebElement target1 = driver.findElement(By.cssSelector("#droppable"));
		a.dragAndDrop(source1, target1).build().perform();

	}
}
