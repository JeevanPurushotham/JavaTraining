package com.openclosePrincipal;

public class discountcalculator 
{
 //static double discount=20.0;
 public static double calculate(Openclose ref)
 {
	 double discount=20.0;
	 if(ref.loyalcustomer())
	 {
		 discount =discount*1.5;
	 }
	return discount;
 }
}
