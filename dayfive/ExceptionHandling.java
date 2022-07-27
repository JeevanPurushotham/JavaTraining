package com.josh.java.Training.dayfive;

/*A Runtime error is called an Exceptions error. 
 * It is any event that interrupts the normal flow of program execution.*/

public class ExceptionHandling {
	public static void main(String[] args) {
		// try block -- used to write risk code.
		try {
			int FirstNumber = 10;
			int SecondNumber = 0;
			int Output = FirstNumber / SecondNumber;
			System.out.println("Output : " + Output);
			// catch block -- used to alternate code
		} catch (ArithmeticException e) {
			System.out.println("Handled");
		} finally {
			System.out.println("it is executed irrespective of occurance of exception");
		}
	}
}
