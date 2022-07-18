package Day3_Oops.MethodRidding;

public class Android {
  public void ShowApp()
  {
	  System.out.println("Showing how much application we can instal");
  }
}
class Samsung extends Android{ 
	@Override
  public void ShowApp()
  {
	  System.out.println("10 Application");
  }
}
class Nokia extends Android
{   @Override
	public void ShowApp()
	{
		System.out.println("15 Application");
	}
}
class OnePlus extends Android
{   @Override
	public void ShowApp()
	{
		System.out.println("20 Application");
	}
	public static void main(String[] args) {
		Android a=new Android();
		a.ShowApp();
	}
}
