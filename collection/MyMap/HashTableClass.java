package com.josh.java.Training.collection.MyMap;

import java.util.Hashtable;

public class HashTableClass {
	public static void main(String[] args) {
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Jerry");
		h1.put(3, "MIka");
		h1.put(3, "MIka");
		System.out.println(h1);
		// create a clone copy/shallow copy:
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone(); // clone return Object type

		System.out.println("value from h1: " + h1);
		System.out.println("value from h2: " + h2);

		h1.clear();
		System.out.println("value from h1: " + h1);

		// contains value:
		Hashtable st = new Hashtable();
		st.put("A", "Milos");
		st.put("B", "Pera");
		st.put("C", "Mika");
		if (st.containsValue("Mika"))
			System.out.println("He is found");

	}

}
