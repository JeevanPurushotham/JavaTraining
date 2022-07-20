package Day_4.Interface;

public interface Interface_ {
	public static void main(String[] args) 
	{
		Demo d =new Demo();
		d.display(1);
	}
}
	interface Demo1       //super interface   1                                                                 
	{  
		public static void display(int a)                         
		{
			System.out.println("this is view()");                                    
		}
			}
	interface Sample1    //super interface 2
	{
		public static void display(int a)
		{
			System.out.println(".............");
		}	
	}
	class Demo implements Sample1,Demo1         //implementationClass                                                    
	{   
		//@Override
      public static void display(int a)
      {
       System.out.println("this is a display()");
      }
}
