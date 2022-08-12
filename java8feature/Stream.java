package com.josh.java.Training.java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 2, 4, 3);
		System.out.println(list);
		list.forEach(s -> System.out.println(s));
		// Stream and filter method
		Set<Integer> s = list.stream().filter(x -> x % 2 == 1).collect(Collectors.toSet());
		System.out.println(s);

		// Reference method
		list.forEach(System.out::println);
	}

}
