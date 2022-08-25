package com.dependencyinversion;

public class helperclass {
	public static product getproduct()
	{
		product pro=new productdatabase();
		return pro;
	}

}
