package com.josh.java.Training.collection.filehandling;

import java.io.File;
import java.io.IOException;

public class ReadOnlyMethod {
	 public static void main(String[] args) throws IOException
	    {	
	    	File myfile = new File("D:\\Programs\\JavaTraining\\src\\Jeevan\\jee.txt");
	    	//making the file read only
	    	boolean flag = myfile.setReadOnly();	
	    	if (flag==true)
	    	{
	    	   System.out.println("File successfully converted to Read only mode!!");
	    	}
	    	else
	    	{
	    	   System.out.println("Unsuccessful Operation!!");
	    	}
	    }
}
