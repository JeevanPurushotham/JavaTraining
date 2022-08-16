package com.josh.java.Training.typeconvertion;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackraceToString {

	public static void main(String[] args) {
		try {
			int i = 5 / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			/*
			 * This block of code would convert the stacktrace to string by using
			 * Throwable.printStackTrace(PrintWriter pw() which sends the stacktrace to the
			 * writer that we can convert to string using tostring()
			 */
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String stacktraceString = sw.toString();
			System.out.println("String is: " + stacktraceString);
		}
	}
}
