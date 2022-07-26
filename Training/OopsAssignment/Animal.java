package com.josh.java.Training.OopsAssignment;

public abstract class Animal { // abstract class
	String name;

	public Animal(String name) { // using constructor initiation the data member

		this.name = name;
	}

	abstract void greets(); // abstract method
}

class Cat extends Animal // cat class extends the animal abstract class
{
	public Cat(String name) {
		super(name); // super key used calling the immediate superclass constructor
	}

	@Override // @override used to compare the parent class and subclass method declaration
	void greets() {
		System.out.println("Meow");

	}

}

class Dog extends Animal { // dog class extends the Animal abstract class

	public Dog(String name) {
		super(name); // //super key used calling the immediate superclass constructor
	}

	@Override
	void greets() {
		System.out.println("woof");

	}

	void greets1(String another) {
		System.out.println("woooof");
	}

}

class Bigdog extends Dog { // bigDog class extends the dog class

	public Bigdog(String name) {
		super(name); // //super key used calling the immediate superclass constructor
	}

	@Override
	void greets() { // this methods are working like method overloading because only arguments
					// change in the method declaration
		System.out.println("woooow");
	}

	void greets(int Dog) {
		System.out.println("woooow");
	}

	void greets(String bigDog) {
		System.out.println("wooooooooow");
	}
}
