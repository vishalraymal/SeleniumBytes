package day35;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=0)
	public void openingApp()
	{
		System.out.println("Opening application...");
	}

	@Test(priority=1)
	public void loginApp()
	{
		System.out.println("Login application...");

	}
	
	@Test(priority=2)
	public void logoutApp()
	{
		System.out.println("Logout application...");

	}
	
	@Test(priority=3)
	public void closeApp()
	{
		System.out.println("closing application...");

	}
	
	/* Priority can start from 0, number can not be consecutive, but execution will be as per increment order, 
	   Which ever is lower number will execute first and so on.. based on priority--
	   Order of execution will control with Priority with TestNG annotations..
	   if we only use @Test without Priority or with Same Priority then it will execute as per alphabetic order..
	   
	  */ 
}

