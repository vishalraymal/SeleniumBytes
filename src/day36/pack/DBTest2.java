package day36.pack;

import org.testng.annotations.Test;

public class DBTest2 {
	
	@Test(priority=3)
	public void select()
	{
		System.out.println("Selection order completed...");
	}
	
	@Test(priority=4)
	public void delete()
	{
		System.out.println("Deletion order completed....");
	}


}
