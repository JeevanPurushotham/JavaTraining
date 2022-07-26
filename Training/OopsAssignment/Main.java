package com.josh.java.Training.OopsAssignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class used to taking input from user
		System.out.println("Press 1 for Quation number one : ");
		System.out.println("Press 2 for Quation number four : ");
		int input = sc.nextInt(); // taking input storing the value inside another variable
		switch (input) // switch statement used to allow the value of a variable or expression to
						// change the control flow of program execution via search and map.
		{
		case 1: // case one for Program two
			Student student = new Student("Jeevan", "mys", "josh", 3, 25000);
			Staff staff = new Staff("harish", "bang", "pes", 30000);
			System.out.println(staff);
			System.out.println(student);
			break; // break keyword for break the loop
		case 2: // case two for Program four
			Bigdog bigDog = new Bigdog("big");
			Dog dog = new Dog("uh");
			Cat cat = new Cat("cat");
			dog.greets();
			cat.greets();
			bigDog.greets(0);
			bigDog.greets1("as");
			bigDog.greets1("another");
			bigDog.greets(null);
			break;
		}

	}
}
