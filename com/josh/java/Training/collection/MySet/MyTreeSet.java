package com.josh.java.Training.collection.MySet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		Set<Integer> treeset = new TreeSet<>();
		treeset.add(50);
		treeset.add(30);
		treeset.add(50);
		treeset.add(20);
		treeset.add(10);
		Iterator<Integer> iterator = treeset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
