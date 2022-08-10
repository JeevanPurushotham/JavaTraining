package com.josh.java.Training.collection.filehandling;

import java.io.File;
import java.io.IOException;

public class HiddenProgram {
	public static void main(String[] args) throws IOException, SecurityException
    {	
    	// Provide the complete file path here
    	File file = new File("D:\\Programs\\JavaTraining\\src\\Jeevan\\jee.txt");
 
    	if(file.isHidden()){
    		System.out.println("The specified file is hidden");
    	}else{
    		System.out.println("The specified file is not hidden");
    	}
    }
}
