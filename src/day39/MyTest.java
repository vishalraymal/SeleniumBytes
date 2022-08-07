package day39;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(day39.MyListener.class)   //Without testng.xml file we can use Listener class with this code
public class MyTest {

	@Test(priority=1)
	public void test1()
	{
		Assert.assertEquals("A", "A");
	}
	
	@Test(priority=2)
	public void test2()
	{
		Assert.assertEquals("A", "B");
	}
	
	@Test(priority=3, dependsOnMethods= {"test2"})
	public void test3()
	{
		Assert.assertEquals("A", "A");
	}
	
	
	
}
