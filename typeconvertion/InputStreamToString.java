package com.josh.java.Training.typeconvertion;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamToString {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		InputStream is = new ByteArrayInputStream("This is the content of my file".getBytes());
		StringBuilder sb = new StringBuilder();
		String content;
		try {
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			while ((content = br.readLine()) != null) {
				sb.append(content);
			}
		} catch (IOException ioe) {
			System.out.println("IO Exception occurred");
			ioe.printStackTrace();
		} finally {
			try {
				isr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		String mystring = sb.toString();
		System.out.println(mystring);
	}

}
