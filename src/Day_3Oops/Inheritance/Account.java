package Day_3Oops.Inheritance;

public class Account {
	public void user(long accNO,double bal,String name)
	{
		System.out.println("user accNO created");
	}

		public void deposit(int amt)
		{
           System.out.println("deposit");
		}
		public void withdrow(int amt)
		{
            System.out.println("withdrow");
		}
	}
class saving extends Account
{
	public void test()
	{
		System.out.println("acc");
	}
}
class current extends saving
{
	public void show_min_bal()
	{
		double min_bal=500;

	}
	public static void main(String[] args) 
	{
		current c=new current();
		c.user(123456,5000,"jeevan");

	}
}
