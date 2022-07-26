package com.josh.java.Training.OopsAssignment;

public class Person { // super class
	private String name; // data members
	private String address;

	public Person(String name, String address) { // using constructor initiation the data member

		this.name = name; // using this key word when we have data member and local member having same
							// name
		this.address = address;
	}

	public String getName() { // Getter for get the name
		return name;
	}

	public void setName(String name) { // setter for set the name
		this.name = name;
	}

	public String getAddress() { // //Getter for get the address
		return address;
	}

	public void setAddress(String address) { //// setter for set the address
		this.address = address;
	}

	@Override
	public String toString() { // The method is used to get a String object representing the value of the
								// Number Object
		return "Person [name=" + name + ", address=" + address + "]";
	}

}

class Student extends Person {
	String program;
	int year;
	double fee;

	public Student(String name, String address, String program, int year, double fee) {
		super(name, address); // super key with arguments for calling immediate super class contractor.
		this.program = program; // using this key word when we have data member and local member having same
		// name
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() { // The method is used to get a String object representing the value of the
								// Number Object
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + "]";
	}

}

class Staff extends Person {
	String school;
	double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school; // using this key word when we have data member and local member having same.
		// name
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() { // The method is used to get a String object representing the value of the
								// Number Object
		return "Staff [school=" + school + ", pay=" + pay + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}

}
