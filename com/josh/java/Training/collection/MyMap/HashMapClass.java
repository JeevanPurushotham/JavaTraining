package com.josh.java.Training.collection.MyMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Java");
		hm.put(2, "Spring");
		hm.put(3, "JavaFX");
		hm.put(4, "Go");

		System.out.println(hm.get(1));

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
		System.out.println(hm);
		// remove from HashMap
		hm.remove(2);
		System.out.println(hm);
	}
}
