package com.josh.java.Training.collection.MyList;

import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		Vector<Object> vectorObj = new Vector<Object>();
		vectorObj.add("Jeevan");
		vectorObj.add(1);
		vectorObj.add("lohith");
		vectorObj.addElement(23);
		// capacity Method used for check the capacity of the vector.
		// size method used for check the capacity of the present in vector.
		System.out.println(vectorObj.capacity());
		System.out.println(vectorObj.size());
		System.out.println(".......................");
		// Advance for loop -->for retrieving the values
		for (Object variable : vectorObj) {
			System.out.println(variable);
		}
	}

}
