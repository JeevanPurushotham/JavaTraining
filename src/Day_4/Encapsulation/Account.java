package Day_4.Encapsulation;

public class Account
{
   private double bal;
   public void Setbal(double bal)
   {
	   if(bal>=0)
	   {
		   this.bal=bal;
	   }
	   else
	   {
		   System.out.println("Invaid balance");
	   }
   }
   public double getbal()
    {
	return this.bal;
    }
}
class Transaction
{
	public static void Deposit(double amount,Account ref) 
	{
		double b1=ref.getbal();
		b1=b1+amount;
		ref.Setbal(b1);
	}
	public static void withdraw(double amount,Account ref)
	{
		double b2=ref.getbal();
		b2=b2-amount;
		ref.Setbal(b2);
	}
	public static void checkbal(Account ref)
	{
		double b3=ref.getbal();
		System.out.println("Current balance is : "+b3);
	}
}
class MainClassForEncapsulation
{
	public static void main(String[] args) 
	{
		Account a1=new Account();
		Transaction.Deposit(37000, a1);
		Transaction.checkbal(a1);
		Transaction.withdraw(5000, a1);
		Transaction.checkbal(a1);
	}
}
