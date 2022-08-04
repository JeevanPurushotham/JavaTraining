package com.josh.java.Training.collection.MyList;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayListObj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MybookingShow> arraylistobj = new ArrayList<MybookingShow>();
		System.out.println("      Welcome to MybookinShow \n");
		System.out.println("  1)Thor Love and Thunder\n" + "  2)Vikrant Rona and\n" + "  3)KGF Chapter 2");
		System.out.println("Please enter movie number for get details :");

		int movieName = sc.nextInt();
		switch (movieName) {
		case 1:
			arraylistobj.add(new MybookingShow("Thor: Love and Thunder", "3D", 450.50, "Bangaloor"));
			break;
		case 2:
			arraylistobj.add(new MybookingShow("Vikrant Rona", "2D", 350, "Bangaloor"));
			break;
		case 3:
			arraylistobj.add(new MybookingShow("KGF Chapter 2", "3D", 650.50, "Bangaloor"));
			break;

		}
		sc.close();
		for (MybookingShow movies : arraylistobj) {
			System.out.println(movies);
		}

	}

}
/*Output-->
 *  Welcome to MybookinShow 

  1)Thor Love and Thunder
  2)Vikrant Rona and
  3)KGF Chapter 2
Please enter movie number for get details :
1
MybookingShow(movieName=Thor: Love and Thunder, movietype=3D, cost=450.5, location=Bangaloor)
*/
