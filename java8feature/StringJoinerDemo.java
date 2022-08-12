package com.josh.java.Training.java8feature;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		/*
		 * Passing comma(,) as delimiter and opening bracket "(" as prefix and closing
		 * bracket ")" as suffix
		 */
		StringJoiner mystring = new StringJoiner(",", "(", ")");

		// Joining multiple strings by using add() method
		mystring.add("Jeevan");
		mystring.add("Manoj");
		mystring.add("Harish");
		mystring.add("Pavan");

		// Displaying the output String
		System.out.println(mystring);
	}

}
