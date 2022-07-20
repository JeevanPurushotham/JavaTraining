package Day_4.Abstract;

public abstract class Sample {
    protected abstract void Display();
    protected void test()
    {
    	System.out.println("this is protected method");
    }
}
class DemoModule extends Sample
{
	@Override
	
	 protected void Display()
	{   
		super.test();
		System.out.println("This is for test");
	}
}

