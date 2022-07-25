package Assessment;

import java.util.Scanner;

public class Program7 { // CheckerPattern
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number : ");
		int input = sc.nextInt(); // input taking for nth value
		for (int i = 0; i < input - 1; i++) { // outer loop for column printing

			for (int j = 0; j < input; j++) { // inner loop for row printing

				if (i % 2 == 0) { // condition for printing in order
					System.out.print("#" + " ");
				} else
					System.out.print(" " + "#");
			}

			System.out.println();
		}
	}
}
