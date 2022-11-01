package com.corejava.demo;

public class CheckStringNumeric {
	
	public static void main(String[] args) {
		String s= "1234.55";
		boolean numeric = true;
		
		try
		{
			Double num = Double.parseDouble(s);
		}
		catch(Exception e)
		{
			numeric=false;
		}
		
		if(numeric=true)
		{
			System.out.println("String is numeric");
		}
		else
		{
			System.out.println("String is not numeric");
		}
		
	}
	

}
