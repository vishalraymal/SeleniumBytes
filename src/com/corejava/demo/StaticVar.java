package com.corejava.demo;

public class StaticVar {
	
	String name;
	String address;
	static String city="Pune";
	static int i=0;
	
	StaticVar(String name, String address)   // Construction- to initialize, can be called while object creation
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	
	public void getAdress()
	{
		System.out.println(address+" of the city: "+city);
	}
	
	
	public static void main(String[] args) 
	{
		StaticVar obj= new StaticVar("bob", "maithili");
		StaticVar obj1= new StaticVar("vishal","aadarashcolny");
		obj.getAdress();
		obj1.getAdress();
		
		
		
	}
}
