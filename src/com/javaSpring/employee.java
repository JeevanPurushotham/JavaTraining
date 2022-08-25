package com.javaSpring;

public class employee {
	int id;
	String name;
	long phnoo;
	public employee(int id, String name, long phnoo) {
		super();
		this.id = id;
		this.name = name;
		this.phnoo = phnoo;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", phnoo=" + phnoo + "]";
	}
	

}
