package com.corejava.demo;

public class AndDemo {
	
	public static void main(String[] args) {
		boolean a = true;
		boolean b= true;
		boolean c= true;
		boolean d= true;
		boolean e= true;
		boolean f= true;
		boolean g= false;
		
		boolean result = a && b && c && d && e && e && f && g;
		System.out.println(result);
	}

}
