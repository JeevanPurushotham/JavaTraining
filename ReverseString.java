package com.josh.java.Training.daysix;

public class ReverseString {
	public static void main(String[] args) {
		String string = "jeevan";
//		String Output="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//		   char ch=string.charAt(i);
//		   Output=Output+ch;
//		}
//      System.out.println(Output);
		StringBuffer sb = new StringBuffer(string);
		System.err.println(sb.reverse());
	}

}
