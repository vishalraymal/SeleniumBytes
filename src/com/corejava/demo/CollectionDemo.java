package com.corejava.demo;
import java.util.ArrayList;
public class CollectionDemo 
{
	public static void main(String[] args) 
	{
		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };            // output - 4-3, 5-3, 6-2, 9-1
		ArrayList<Integer> al = new ArrayList<Integer>();  // Empty ArrayList
		for (int i = 0; i < a.length; i++) 
		{
			int k = 0;
			if (al.contains(a[i]))
			{

			} else 
			{
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) 
				{
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " : " + k);
				if(k==1)
				{
					System.out.println(a[i]+" is unique number");
				}
			}
		}
	}
}
