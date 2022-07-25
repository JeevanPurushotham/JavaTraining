package Assessment;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) { // main block
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 number : "); // taking first input
		int inputOne = sc.nextInt();
		System.out.println("Enter 2 number : ");// taking second input
		int inputTwo = sc.nextInt();
		System.out.println("Enter operation number : "); // taking operation input
		char inputThree = sc.next().charAt(0);
		String output = "";
		switch (inputThree) { // switch statement for check operation
		case ('-'):
			int sub = inputOne - inputTwo;
			System.out.println(inputOne + "-" + inputTwo + " = " + sub);
			break;

		case ('+'):
			int sub1 = inputOne + inputTwo;
			System.out.println(inputOne + "+" + inputTwo + " =  " + sub1);
			break;
		case ('*'):
			int sub11 = inputOne * inputTwo;
			System.out.println(inputOne + "*" + inputTwo + " = " + sub11);
			break;

		case ('/'):
			int sub111 = inputOne / inputTwo;
			System.out.println(inputOne + "/" + inputTwo + " = " + sub111);
			break;

		default:

			System.err.println("Error: invalid operator!");

		}
	}

}
