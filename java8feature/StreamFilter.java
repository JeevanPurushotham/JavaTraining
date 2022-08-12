package com.josh.java.Training.java8feature;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Jeevan");
		names.add("Anirudh");
		names.add("Gireesh");
		names.add("Lohith");

		// Using Stream and Lambda expression
		long count = names.stream().filter(str -> str.length() > 6).count();
		System.out.println("There are " + count + " strings with length less than 6");

	}
}
