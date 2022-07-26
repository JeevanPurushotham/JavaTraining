package com.josh.java.Training.ControllsmtAssignment;

import java.util.Scanner;

public class Program13 {
	public static int linear(int array[], int x)     //solution block
    {
        for (int i = 0; i < array.length; i++) {   //logic for linear search
            if (array[i] == x)
                return i;
        }
        return -1;
    }
	public static void main(String[] args) {   // main block
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter searching element : ");
		int search_Element=sc.nextInt();   //using scanner class taking input for searching element
		int [] ar= {1,5,4,3,8};
		int Output=linear(ar,search_Element);  //output storing in another variable
		System.out.println("The index value of "+ search_Element +" is "+Output ); //output printing statement
	}
}
