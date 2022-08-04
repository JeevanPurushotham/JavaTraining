package com.josh.java.Training.collection.MySet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*it  preserve insertion order.
 * do not have index.
 * do not store duplicate
 * it allows only one null value.
 */
public class MyLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add(10);
		linkedhashset.add(20);
		linkedhashset.add(50);
		linkedhashset.add(40);

		linkedhashset.add(null);
		linkedhashset.add(null);
		Iterator<Integer> iterator = linkedhashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
