package com.dependencyinversion;

public class Displayproduct {
	public void display()
	{
		product p1=helperclass.getproduct();
		int a1=p1.read();
		System.out.println("no of product :" +a1/10);
	}

}
