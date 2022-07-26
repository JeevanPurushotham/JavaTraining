package com.josh.java.Training.ControllsmtAssignment;

import java.util.Scanner;

public class AssmntOne {
	public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) {

            System.out.println("Weird");
        } else if (2 <= n && n <= 10) {
            System.out.println("Not Weird");
        } else if (11 <= n && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
