package com.josh.java.Training.java8feature;

/*Functional interface means which interface have only one abstract method that interface called functional interface.
 * but here we use two abstract method it is also functional interface because we can use multiple abstract method which is already 
 * present in object class so we can write our own abstract method only once that's called functional interface.
 */
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	int calculate(int i, int j);

//	boolean equals(Object obj);

//	String toString();
	// String conCat();
}
