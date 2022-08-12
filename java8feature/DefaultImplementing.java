package com.josh.java.Training.java8feature;

public class DefaultImplementing implements DefaultInterfaceDemo {
	public void existingMethod(String str) {
		System.out.println("String is: " + str);
	}

	public static void main(String[] args) {
		DefaultImplementing obj = new DefaultImplementing();

		// calling the default method of interface
		obj.newMethod();
		// calling the abstract method of interface
		obj.existingMethod("Java 8 is easy to learn");

	}
}
