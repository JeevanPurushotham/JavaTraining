package Day_4.Interface;

public class InterFace {
	public static void main(String[] args) 
	{
		 ImplementClass d =new ImplementClass();
		d.test(10);
		d.display();
	}
}
	interface Sample                       //super interface
	{  
		int v=10;                          //by default v1 is final and static
		public void test(int a1);          //default abstract method
	}
	class ImplementClass implements Sample //Implementation class
	{                                      //class implement 2 or more 
		                                   //interface at the same time
	  @Override	
      public void test(int a1)
      {
      	System.out.println("this is a test Method : "+a1);
      }
      public void display()
      {
       System.out.println("this is a display()");
      }
}
