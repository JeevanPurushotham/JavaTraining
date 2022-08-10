package com.josh.java.Training.collection.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderAndBufferWritter {

	public static void main(String[] args) throws IOException {
		// creation the file
		BufferedWriter buffer = new BufferedWriter(
				new FileWriter("D:\\Programs\\JavaTraining\\src\\Jeevan\\fileTwo.txt"));

		buffer.write("hello\n");
		buffer.write("this is jeevan");
		buffer.write("\ni think ");
		buffer.write("\nthis program");
		buffer.write("\nworking properly");
		buffer.close();
		// creating another folder using file class
		File file = new File("D:\\Programs\\JavaTraining\\src\\Jeevan\\fileThree.txt");
		file.createNewFile();
		System.out.println(" created");
		BufferedWriter bu = new BufferedWriter(new FileWriter("D:\\Programs\\JavaTraining\\src\\Jeevan\\fileOne.txt"));
		bu.write("hi");
		bu.write("hello");
		bu.close();

		BufferedReader reader = new BufferedReader(
				new FileReader("D:\\Programs\\JavaTraining\\src\\Jeevan\\fileOne.txt"));// reading

		String a = null;
		while ((a = reader.readLine()) != null) {
			System.out.println(a);
		}
		reader.close();

		System.out.println("..................................................");

		BufferedReader reader1 = new BufferedReader(new FileReader("D:\\Programs\\JavaTraining\\src\\Jeevan\\fileThree.txt"));// reading

		String a1 = null;
		while ((a1 = reader1.readLine()) != null) {
			System.out.println(a1);
		}
		reader1.close();

		System.out.println("...................................................");
		if (file.isHidden()) {
			System.out.println("The specified file is hidden");
		} else {
			System.out.println("The specified file is not hidden");
		}

		// here delete the file using delete method
		file.delete();

	}

}
