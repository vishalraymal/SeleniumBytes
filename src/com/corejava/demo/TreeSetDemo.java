package com.corejava.demo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set t = new TreeSet();
		t.add("Vishal");
		//t.add(null);
		t.add("Raymal");
		t.add("Vishal");
		t.add("Aal");
		System.out.println(t);
	}

}
