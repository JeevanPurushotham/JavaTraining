package com.josh.java.Training.daysix;

/*Enum in Java is a datatype which stores a set of constant values.*/
class EnumarationMain {
	enum Enumaration {
		Jeevan, Pavan, Nithi, Chandu
	}

	public static void main(String[] args) {
		Enumaration dir = Enumaration.Jeevan;

		if (dir == Enumaration.Jeevan) {
			System.out.println("This is Jeevan");
		} else if (dir == Enumaration.Pavan) {
			System.out.println("This is Pavan");
		} else if (dir == Enumaration.Nithi) {
			System.out.println("This is Nithi");
		} else if (dir == Enumaration.Chandu) {
			System.out.println("This is Chandu");
		} else {
			System.out.println("Please check the input");
		}
	}
}
