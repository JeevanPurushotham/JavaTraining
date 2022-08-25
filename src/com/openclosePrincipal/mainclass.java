package com.openclosePrincipal;
import java.util.*;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Openclose c1=  new homelonecustomer();//upcasting --for hide the imlementation class
//      double d2=discountcalculator.calculate(c1);// here we are calling static method inside main method (classname.method name)
//      System.out.println(d2);
//      Openclose c2=  new educationalLonecustomer();
//      double d3=discountcalculator.calculate(c2);
//      System.out.println(d3);
//      Openclose c3=  new goldloan();
//      double d4=discountcalculator.calculate(c3);
//      System.out.println(d4);
		ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(1,5,2,2,3,3,4));
		ArrayList<Object> list2 = new ArrayList<Object>(Arrays.asList(10,20,30,30,10,20,40));
//		list.add(1);
//		list.add(5);
//		list.add(2);
//		list.add(2);
//		list.add(3);
//		list.add(3);
		//System.out.println(list);
	    for(Object obj:list)
		System.out.print(obj+" ");
	    System.out.println();
		
		Stack<Object> set = new Stack<Object>();
		set.addAll(list2);
     	//set.addAll(list);
//		list.clear();
//		list.addAll(set);
//		System.out.println(list);
//		TreeSet<Object> s1=new TreeSet<Object>(list);
//		System.out.println(s1);
		//System.out.println(list2.parallelStream());
//		for(int i=0;i<set.size();i++)
//		System.out.println(set.get(i));
		System.out.println(set.pop());
		System.out.println(set.pop());
		System.out.println(set.pop());
		System.out.println(set.size());
	 
	}
}
