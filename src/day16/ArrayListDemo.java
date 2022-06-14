package day16;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration
		ArrayList mylist = new ArrayList();
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

		// Size of arraylist
		System.out.println(mylist.size());

		// Display array list value
		System.out.println(mylist);

		// Remove 100 from 5th Index
		mylist.remove(5);
		System.out.println("After Removing 5th Index :" + mylist);

		// Insert value in the middle of list
		mylist.add(3, "java");
		System.out.println("after adding 3rd Index :" + mylist);

		// Read-Retrieve specific value from arraylist
		Object name = mylist.get(2);
		System.out.println("Value present at the index 2 is : " + name);

		// Reading all the values from arrayList
		for (Object x : mylist) {
			System.out.println(x);
		}

		// clear list
		mylist.clear();
		System.out.println("After clearing the list: " + mylist);

	}
}
