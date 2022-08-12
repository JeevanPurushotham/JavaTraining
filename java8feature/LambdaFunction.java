package com.josh.java.Training.java8feature;

import java.util.ArrayList;

public class LambdaFunction {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);

		numbers.forEach((n) -> {
			System.out.println(n);
		});

//         we can use Lambda function below shows 
//         when we need to return something using Lambda function. 
//	       FunctionalInterfaceDemo add =  (x,y)->{
//		   return x+y;
//      	};

		FunctionalInterfaceDemo add = (x, y) -> x + y;
		System.out.println("\nThe addition of two number : " + add.calculate(4, 5));

//		FunctionalInterfaceDemo ref = () -> {
//			String string = "Jeevan";
//			String stringOne = " P";
//			return string + stringOne;
//		};
//		System.out.println(ref.conCat());

	}
}
