package Day_2;

import java.util.Scanner;

public class ForLoop {

		public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter nth  value : ");
		 int NumberOne=sc.nextInt();
		 FristMethod(NumberOne);
		}
		public static void FristMethod(int NumberOne)
		{  
			int sum=0;
			for(int i = 1; i <= NumberOne; ++i)  
			{  
			sum = sum + i;  
			}    
			System.out.println("Sum of First 10 Natural Numbers is : " + sum); 
		}
	}


