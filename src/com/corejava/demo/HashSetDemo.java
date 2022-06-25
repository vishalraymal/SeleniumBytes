package com.corejava.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		// Indexing not preserved
		// Dup
		
		HashSet hs= new HashSet();	
		hs.add("pavan");
		hs.add("pavan");
		hs.add(null);
		hs.add("vishal");
		boolean status= hs.isEmpty();
		System.out.println(status);
		
		
		// iterator
		System.out.println(hs);
		Iterator<String> i= hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
