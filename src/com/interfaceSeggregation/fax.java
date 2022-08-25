package com.interfaceSeggregation;

public class fax  implements machinefax,machinexerox,machinescan{

	@Override
	public void fax() {
		// TODO Auto-generated method stub
		System.out.println("able to scan");
		
	}

	@Override
	public void xerox() {
		// TODO Auto-generated method stub
		System.out.println("able to xerox");
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("able to fax");
		
	}

	
	

}
