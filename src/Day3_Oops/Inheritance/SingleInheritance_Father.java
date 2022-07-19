package Day3_Oops.Inheritance;

public class SingleInheritance_Father {
	public void skincolor()
	{
		System.out.println("fair");
	}
}
  class Son extends  SingleInheritance_Father
  {
  	public void heigth()
  	{
  		System.out.println("son is taller!!!");
  	}

	public static void main(String[] args) 
	{
		// Father f1 = new Father();
		// f1.skincolor();
		Son s1 =new Son();
		s1.heigth();
	}
}
