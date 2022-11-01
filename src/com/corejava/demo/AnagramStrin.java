package com.corejava.demo;

import java.util.Arrays;

public class AnagramStrin {
	
	public static void main(String[] args) {
		String s1= "Rpae";
		String s2= "Care";
		
		// Convert string to lowercase
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		System.out.println("FirstString   :"+ str1);
		System.out.println("SecondString  :"+ str2);
		
		
		//Compare length of both string
		if(str1.length() == str2.length())
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			// Sort character array
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			//if sorted array are same then string is anagram
			boolean result = Arrays.equals(ch1, ch2);
			if(result)
			{
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("String is not anagram");
			}
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		
	}

}
