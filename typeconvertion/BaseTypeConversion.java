package com.josh.java.Training.typeconvertion;

public class BaseTypeConversion {

	public static void main(String[] args) {

		String octal = "127";
		int intvar = Integer.parseInt(octal, 8);
		System.out.println(intvar);
		String a = Integer.toString(intvar, 2);
		System.out.println(a);

		System.out.println("\nBinary representation of 999: ");
		System.out.println(Integer.toBinaryString(999));

		System.out.println("\nBinary representation of 124: ");
		System.out.println(Integer.toBinaryString(124));

		// Binary to string
		String number = "10101";
		int bnum = Integer.parseInt(number, 2);
		String ostr = Integer.toOctalString(bnum);
		System.out.println("Octal Value after conversion is: " + ostr);

		// binary to octal
		String numberOne = "10101";
		int bnumone = Integer.parseInt(numberOne, 2);
		String ostrone = Integer.toOctalString(bnumone);
		System.out.println("Octal Value after conversion is: " + ostrone);

		// integer to hexadecimal
		int num = 123;
		String str = Integer.toHexString(num);
		System.out.println("Method 1: Decimal to hexadecimal: " + str);

		// Hexadecimal to integer
		String hexnum = "6F";
		// converting hex to decimal by passing base 16
		int numone = Integer.parseInt(hexnum, 16);
		System.out.println("Decimal equivalent of given hex number: " + numone);

		// decimal to octal conversion
		int nums = 123;
		String octalString = Integer.toOctalString(nums);
		System.out.println("Method 1: Decimal to octal: " + octalString);

		// octal to decimal
		String onum = "157";
		// octal to decimal using Integer.parseInt()
		int numtwo = Integer.parseInt(onum, 8);
		System.out.println("Decimal equivalent of Octal value 157 is: " + numtwo);

	}
}
