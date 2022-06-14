package day16;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		// Declaration
		HashSet myset = new HashSet();
		// Set myset= new HashSet();

		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add(null);
		myset.add(100); // Duplicates are not allowed
		myset.add(null); // nulls are allowed only once

		System.out.println(myset); // avoid duplicate

		// remove from set
		myset.remove("Welcome"); // we need to pass value not index, coz index is not supported
		System.out.println("after removing : " + myset);

		// insert a new value
		// myset.add(myset); //not support because there is no insertion

		// retrive methods not support in set
		// myset.get(); // Not supported as we need to pass index

		// Read data from HashSet
		for (Object x : myset) {
			System.out.println(x);
		}

		// Clear every value from HashSet
		myset.clear();
		System.out.println("After clearing : " + myset);

	}

}
