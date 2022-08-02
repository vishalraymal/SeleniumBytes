package com.corejava.demo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		//ArrayList, LinkedList, Vector implementing List interface
		//array have fixed size where as ArrayList is growable in nature
		//You can access and insert any value in index
		//In arraylist index is preserved
		// Duplicates are allowed
		
		
		ArrayList a = new ArrayList();
		a.add("Vishal");
		a.add("Ram");
		a.add("Raymal");
		a.add(null);
		a.add(1230);
		a.add(0, "BOSS");
		
		System.out.println(a.size());
		
		a.remove(2);
		
		System.out.println(a.size());

		
	}

}
