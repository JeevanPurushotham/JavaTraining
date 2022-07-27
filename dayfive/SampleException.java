package com.josh.java.Training.dayfive;

public class SampleException {

	public static void main(String[] args) {
		try
		{
			throw new MyException(5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

