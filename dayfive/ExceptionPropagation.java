package com.josh.java.Training.dayfive;

/* throws keyword used for declare for exception
 *  catch block used write alternate code
  */

public class ExceptionPropagation {
	public static void test() throws InterruptedException {
		System.out.println("test start !!!");
		// try catch used for write risk code
		try {
			Thread.sleep(-1000);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid time");
		}
		System.out.println("end test !!!");
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {

			// throw keyword used for throw the exception
			throw new IllegalArgumentException();
		}
	}
}
