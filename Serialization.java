package com.josh.java.Training.daysix;

import lombok.Data;

/*Serialization in Java is the process of converting the Java code Object into a Byte Stream, 
 * to transfer the Object Code from one Java Virtual machine to another and recreate it using the process of Deserialization.*/
@Data
public class Serialization implements java.io.Serializable {
	private String empid;
	private int empno;
	private int sal;
	private String desg;

	public Serialization(String empid, int empno, int sal, String desg) {
		this.empid = empid;
		this.empno = empno;
		this.sal = sal;
		this.desg = desg;
	}

}
