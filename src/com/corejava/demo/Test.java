package com.corejava.demo;

public class Test {
	public static void main(String[] args) {
		int a=10, b=0;
		
		try
		{
			System.out.println("hello: "+ a/b);
			
		}
		catch(Exception e)
		{
			System.out.println("hello catch block A");
			e.printStackTrace();
			System.out.println("hello catch block B");
		}
		finally
		{
			System.out.println("hello finally");
			
		}
		
	}

}
