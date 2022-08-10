package com.josh.java.Training.collection.filehandling;

import java.io.File;
import java.io.IOException;

public class FolderAndFlieCreateProgram {

	public static void main(String[] args) {
		File file = new File("D:\\Programs\\JavaTraining\\src\\Jeevan");
		if (!file.mkdir()) {
			file.mkdir();
			System.out.println("folder created");
		} else {
			System.out.println("already created");
		}
		try {
			File fileCreate = new File("D:\\Programs\\JavaTraining\\src\\Jeevan\\jee.txt");
			if (!fileCreate.createNewFile()) {
				// reateNewfile method used to create file
				fileCreate.createNewFile();

				System.out.println("file Created");
				// Theses methods give us true or false result
				System.out.println(fileCreate.canRead());
				System.out.println(fileCreate.canWrite());
				// here we use read only method for access only for read
				if (fileCreate.setReadOnly())
					;

			} else {
				System.out.println("Already created");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
