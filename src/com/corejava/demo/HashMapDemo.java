package com.corejava.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap hm= new HashMap();
		hm.put(101, "Vishal");
		hm.put(102, "Raymal");
		hm.put(103, "Vishal");
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.get(102));
		Set sm = hm.entrySet();
		System.out.println(sm);
		
		List a = new ArrayList(sm);
		
		System.out.println(a);
		
		Iterator it =a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
