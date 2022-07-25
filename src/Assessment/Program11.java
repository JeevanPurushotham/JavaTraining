package Assessment;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) { // main block
		Scanner sc = new Scanner(System.in); // scanner class for taking input from user
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int rem = n % 10; // logic for take last value
		String temp = "" + rem;
		n /= 10;
		while (n != 0) {
			rem = n % 10;
			temp = temp + " " + rem;
			n /= 10;
		}
		System.out.println(temp); // printing output
	}

}
