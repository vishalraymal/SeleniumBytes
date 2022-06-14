package day16;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		// Declare
		// Map hm= new HashMap();
		// HashMap hm= new HashMap();

		// adding data into hashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "John");
		hm.put(102, "David");
		hm.put(103, "Smith");
		hm.put(104, "Mary");
		hm.put(105, "John");
		hm.put(101, "xyz"); // Duplicate keys is not allowed

		System.out.println(hm);

		// size
		System.out.println(hm.size());

		// remove the value
		hm.remove(101);
		System.out.println("After removing : " + hm);

		// get the value from specific key
		System.out.println(hm.get(103));

		// Print only keys from hashmap
		System.out.println(hm.keySet());

		// print values from hashmap
		for (Object k : hm.keySet()) {
			System.out.println(hm.get(k));
		}

		// print keys and value from hashmap
		for (Object k : hm.keySet()) {
			System.out.println(k + "   " + hm.get(k));
		}

		// clar hashMap
		hm.clear();
		System.out.println("After clearing.. " + hm);

	}

}
