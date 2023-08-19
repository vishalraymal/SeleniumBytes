
package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1. How to find rows in table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows : "+ rows);   // 7
		
		// 2. Find column in table
		int cols= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns : "+cols);
		
		//3. Retrieve specific value from row and col
		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
		System.out.println("Specific value : "+value);
				
		//4. Read all the data from a table
		for(int r=2; r<=rows; r++) 
		{
			for(int c=1; c<=cols ; c++)
			{
				String colValues = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print("  || "+colValues);
			}
			System.out.println();
			
		}
		
		// 5. Read specific bookName written by Amit author
		int count=0;
		for(int r=2; r<=rows; r++) 
		{
			
				String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
				if(author.equals("Amit"))
				{
					count++;
					String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
					System.out.println("Bookname writtern by "+author+" : "+ bookName);
				}
					
		}
		
		
		// 6. Find total cost of all books
		int total_cost=0;
		for(int r=2; r<=rows; r++) 
		{
			
				String cost = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
				int bookCost = Integer.parseInt(cost);
				total_cost = total_cost+bookCost;
					
		}
		System.out.println("Total Cost of all books are :"+total_cost);
		
		
		
	}

}
