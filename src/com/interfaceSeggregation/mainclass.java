package com.interfaceSeggregation;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    fax f=new fax();
    canon c =new canon();
    epson e=new epson();
    f.fax();
    f.scan();
    f.xerox();
	}

}
