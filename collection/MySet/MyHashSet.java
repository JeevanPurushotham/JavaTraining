package com.josh.java.Training.collection.MySet;

import java.util.*;

/*HashSet do not store duplicate values
 * do not have index.
 * we can store only one null value.
 */
public class MyHashSet {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("1");
		hashSet.add("jeevan P");
		hashSet.add("jeevan p");
		hashSet.add("Lohith");
		hashSet.add("Anirudh");
		// Iterator for retrieving.
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
/*
 * Output-->Gives Not sequence order. 1 Anirudh Lohith jeevan P jeevan p
 */