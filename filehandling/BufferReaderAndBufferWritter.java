package com.josh.java.Training.collection.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderAndBufferWritter {

	public static void main(String[] args) {
		// creation the file
		BufferedWriter buffer;
		BufferedWriter bu = null;
		try {
			buffer = new BufferedWriter(new FileWriter("src\\Jeevan\\fileTwo.txt"));
			buffer.write("hello\n");
			buffer.write("this is jeevan");
			buffer.write("\ni think ");
			buffer.write("\nthis program");
			buffer.write("\nworking properly");
			buffer.close();
			// creating another folder using file class
			File file = new File("src\\Jeevan\\fileThree.txt");
			file.createNewFile();
			System.out.println(" created");
			bu = new BufferedWriter(new FileWriter("src\\Jeevan\\fileOne.txt"));
			bu.write("hi");
			bu.write("hello");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bu.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			BufferedReader reader = null;
			BufferedReader reader1 = null;
			try {
				reader = new BufferedReader(new FileReader("src\\Jeevan\\fileOne.txt"));
				// reading

				String a = null;
				while ((a = reader.readLine()) != null) {
					System.out.println(a);
				}
				// reading
				reader1 = new BufferedReader(new FileReader("src\\Jeevan\\fileThree.txt"));

				String a1 = null;
				while ((a1 = reader1.readLine()) != null) {
					System.out.println(a1);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					reader1.close();
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
