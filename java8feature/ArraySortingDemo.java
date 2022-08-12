package com.josh.java.Training.java8feature;

import java.util.Arrays;

public class ArraySortingDemo {
	public static void main(String[] args) {
		// Creating an integer array
		int[] arr = { 5, 8, 1, 0, 6, 9 };
		// Iterating array elements
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		// Sorting array elements parallel
		Arrays.parallelSort(arr);
		System.out.println("\nArray elements after sorting");
		// Iterating array elements
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		System.out.println();

		int numbers[] = { 22, 89, 1, 32, 19, 5 };
		/*
		 * Specifying the start and end index. The start index is 1 here and the end
		 * index is 5. which means the the elements starting from index 1 till index 5
		 * would be sorted.
		 */
		Arrays.parallelSort(numbers, 1, 5);
		// converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
	}
}
