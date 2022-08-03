package day36.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBTest1 {

	@BeforeTest
	public void connectDbConn()
	{
		System.out.println("DB Connection created..");
	}
	
	@AfterTest
	public void closeDbConn()
	{
		System.out.println("DB Connection closed..");
	}
	
	@Test(priority=1)
	public void insert() 
	{
		System.out.println("Insertion order completed....");
	}
	
	@Test(priority=2)
	public void update() 
	{
		System.out.println("Updation order completed....");
	}
}
