package com.josh.java.Training.daysix;

public class WrapperClass {

	public static void main(String[] args) {
		int IntValue = 10;
		// Converting int primitive into Integer object
		Integer Object = Integer.valueOf(IntValue);
		System.out.println(Object);

		Integer obj = new Integer(100);

		// Converting the wrapper object to primitive
		int num = obj.intValue();

		System.out.println("Premitive value : " + num + " \nObject value : " + obj);

	}

}
