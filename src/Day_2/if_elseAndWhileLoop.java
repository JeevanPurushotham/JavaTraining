package Day_2;

import java.util.Scanner;

public class if_elseAndWhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a Number:");
        int num = scanner.nextInt();
        
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
	}
}

