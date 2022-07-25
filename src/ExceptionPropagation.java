package Day_5;

public class ExceptionPropagation {
	public static void test() throws  InterruptedException
	{
		System.out.println("test start !!!");
		try
		{
			Thread.sleep(-1000);
		}
		catch (IllegalArgumentException e){
			System.out.println("Invalid time");
		}
		System.out.println("end test !!!");
	}
  public static void main(String[] args) {
	try {
		test();
	}
	catch (Exception e)
	{
		throw new IllegalArgumentException();
	}
}
}
