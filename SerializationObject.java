package com.josh.java.Training.daysix;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*Java FileOutputStream is an output stream used for writing data to a file
 * An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream*/
public class SerializationObject {
	public static void main(String[] args) {
		try {
			Serialization serialization = new Serialization("jeevan", 642, 5, "Software");
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\Programs\\details.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(serialization);
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("Serialzation Done!!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}
