package com.josh.assesment.FirstProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListAssesment {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(4);
		array.add(8);
		array.add(10);
		array.add(19);
		array.add(20);
		int sum = 0;
		for (int i = 0; i < array.size(); i++) {
			sum = sum + array.get(i);
			System.out.println(array.get(i));
		}
		System.out.println("Sum of all the arraykist elements : " + sum);

		System.out.println("\nOdd elements :");
		List<Integer> s = array.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println(s);
		array.removeAll(s);

	}
}

