package com.josh.java.Training.collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriortyQueueClass {
	public static void main(String[] args) {
		Comparator<String> stringLengthComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};

		PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

		// Add items to a Priority Queue (ENQUEUE)
		namePriorityQueue.add("Lisa");
		namePriorityQueue.add("Robert");
		namePriorityQueue.add("John");
		namePriorityQueue.add("Chris");
		namePriorityQueue.add("Angelina");
		namePriorityQueue.add("Joe");

		// Remove items from the Priority Queue (DEQUEUE)
		while (!namePriorityQueue.isEmpty()) {
			System.out.println(namePriorityQueue.remove());
		}
	}

}
