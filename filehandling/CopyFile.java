package com.josh.java.Training.collection.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		FileInputStream instream = null;
		FileOutputStream outstream = null;

		try {

			File infile = new File("src\\fileOne.txt");
			File outfile = new File("src\\fileTwo.txt");
			infile.createNewFile();
			outfile.createNewFile();

			instream = new FileInputStream(infile);
			outstream = new FileOutputStream(outfile);

			byte[] buffer = new byte[1024];

			int length;
			/*
			 * copying the contents from input stream to output stream using read and write
			 * methods
			 */
			while ((length = instream.read(buffer)) > 0) {
				outstream.write(buffer, 0, length);
			}
			System.out.println("File copied successfully!!");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				// Closing the input/output file streams
				instream.close();
				outstream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
