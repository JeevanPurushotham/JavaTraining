package com.josh.java.Training.collection.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendProgram {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			String content = "This is my content which would be appended " + "at the end of the specified file";
			// Specify the file name and path here
			File file = new File("src\\Jeevan\\Jeevan.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			// Here true is to append the content to file
			FileWriter fw = new FileWriter(file, true);
			// BufferedWriter writer give better performance
			bw = new BufferedWriter(fw);
			bw.write(content);
			// Closing BufferedWriter Stream
		

			System.out.println("Data successfully appended at the end of file");

		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
		finally {
			try {
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
