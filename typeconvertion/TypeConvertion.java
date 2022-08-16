package com.josh.java.Training.typeconvertion;

public class TypeConvertion {

	public static void main(String[] args) {
		/*
		 * Converting a lower data type into a higher one is called widening type
		 * casting. It is also known as implicit conversion or casting down.
		 */
		int intVar = 10;
		double doubleVar = intVar;
		System.out.println("int to double conversion : " + doubleVar);

		/*
		 * Converting a higher data type into a lower one is called narrowing type
		 * casting. It is also known as explicit conversion or casting up.
		 */
		long longVar = 13456l;
		int varInt = (int) longVar;
		System.out.println("long to int conversion : " + varInt);

		// Integer to String Conversion
		int var = 123;
		String str = Integer.toString(var);
		String strone = String.valueOf(var);
		System.out.println("Integer to String Conversion : " + str + "  " + strone);

		int intv = Integer.parseInt(strone);
		int intvartwo = Integer.valueOf(varInt);
		System.out.println("String to integer Conversion : " + intv);
		System.out.println("string to int primitive type : "+intvartwo);

		// Boolean to string Conversion
		boolean bool = true;
		String strtwo = Boolean.toString(bool);
		System.out.println("Boolean to string Conversion : " + strtwo);

		// String to boolean Conversion
		boolean boolone = Boolean.parseBoolean(strtwo);
		System.out.println("String to boolean Conversion : " + boolone);

		// String to double
		double stringtodouble = Double.valueOf("211.50d");
		System.out.println("String to double Conversion : " + stringtodouble);

		// char to integer conversion
		char ch = 'A';
		char ch2 = 'Z';
		int num = ch;
		int num2 = ch2;
		System.out.println("ASCII value of char " + ch + " is: " + num);
		System.out.println("ASCII value of char " + ch2 + " is: " + num2);

	}

}
