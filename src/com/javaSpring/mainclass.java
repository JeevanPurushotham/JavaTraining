package com.javaSpring;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       employee emp = new employee(123,"jeevan",123456373253553l);
       System.out.println(emp);
       new employeeInsert().insert();
       new employeeRead().read();
       new employeeupdate().update();
	}

}
