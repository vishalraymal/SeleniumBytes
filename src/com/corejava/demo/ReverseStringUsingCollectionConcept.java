package com.corejava.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseStringUsingCollectionConcept {

	public static void main(String[] args) {
		String s = "Shashant";
		char[] ch = s.toCharArray();
		
		List<Character> al = new ArrayList<Character>();
		for(int i=0; i < s.length(); i++)
		{
			al.add(ch[i]);
		}
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Iterator<Character> itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}
	
}
