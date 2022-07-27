package com.josh.java.Training.dayfive;

//here extends the Exception class for achieve the custom exception.

public class MyException extends Exception {
	int a;

	public MyException(int a) {
		this.a = a;
	}

	public String toString() {
		return ("MyException a=" + a);
	}

}
