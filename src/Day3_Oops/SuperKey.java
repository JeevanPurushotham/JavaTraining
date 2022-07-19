package Day3_Oops;

public class SuperKey 
{
	public void FirstMethod()
	{
		System.out.println("Land");
	}
 }
 class Cotton extends SuperKey
 {
	 public void FirstMethod()
		{
			System.out.println("Land");
		}
	public void CottonMethod()
	{  
		super.FirstMethod();
		System.out.println("black soil ");
		System.out.println("it is good to grow");
	}
 }
class Potatoes extends Cotton
{
	public void PotatoesMethod()
	{
		FirstMethod();
		System.out.println("Red soil");
		System.out.println("it is good to grow");
	}
	public static void main(String[] args) 
	{
		Potatoes p=new Potatoes();
		//p.PotatoesMethod();
		p.CottonMethod();
	}
}
