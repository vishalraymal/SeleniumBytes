package day38;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
	
	@Test
	public void test_hardAssertion()
	{
		Assert.assertEquals(10>100, true);
		System.out.println("Hard assertion is executed..."); // Statement will not execute if hard assertion failed
															// we can access hardAssertion using "Assert" class
	}

	@Test
	public void test_softAssertion()
	{
		SoftAssert sa= new SoftAssert();  // SoftAssertion can be access through "SoftAssert"
		sa.assertEquals(10==10, false); 
		System.out.println("Soft assertion is executed..."); // Statement will executed and also assertion will show passed..
		
		//To get accurate result for soft assertion failure, use below assertion
		sa.assertAll();
	}
}
