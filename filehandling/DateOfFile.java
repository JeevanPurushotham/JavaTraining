package com.josh.java.Training.collection.filehandling;

import java.io.File;
import java.text.SimpleDateFormat;

public class DateOfFile {

	public static void main(String[] args) {
		File file = new File("Serialization.ser");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
	}

}
