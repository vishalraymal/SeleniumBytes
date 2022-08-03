package day37;

import org.testng.annotations.Test;

/*
loginByEmail  - sanity & regression
loginByfacebook - sanity
loginBytwitter  - sanity

signupbyemail - sanity & regression
signupbyfacebook  - regression
signupbytwitter  - regression

paymentinrupees - sanity & regression
paymentindollar - sanity  
paymentReturnbyBank  - regression
*/

public class GroupingDemo 
{
	@Test(priority=1, groups= {"sanity","regression"})
	public void loginByEmail()
	{
		
		System.out.println("Login by email method...");
	}
	
	@Test(priority=2, groups= {"sanity"})
	public void loginByfacebook()
	{
		System.out.println("Login by facebook method...");
	
	}
	
	@Test(priority=3, groups= {"sanity"})
	public void loginBytwitter()
	{
		System.out.println("Login by twitter method...");
	
	}
	
	@Test(priority=4, groups= {"sanity","regression"})
	public void signupbyemail()
	{
		System.out.println("Sign up email method...");		
	}
	
	@Test(priority=5, groups="regression")
	public void signupbyfacebook()
	{
		System.out.println("Sign up facebook method...");		

		
	}
	
	@Test(priority=6, groups= {"regression"})
	public void signupbytwitter()
	{
		System.out.println("Sign up twitter method...");		

		
	}
	
	@Test(priority=7, groups= {"sanity","regression"})
	public void paymentinrupees()
	{
		System.out.println("Payments in rupees....");		

		
	}
	
	@Test(priority=8, groups= {"sanity"},enabled=false)
	public void paymentindollar()
	{
		System.out.println("Payments in dollar....");		

		
	}
	
	@Test(priority=9, groups= {"regression"})
	public void paymentReturnbyBank()
	{
		System.out.println("Payments return by bank....");		

	}
}
