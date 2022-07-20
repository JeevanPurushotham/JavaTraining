package Day_4.Abstraction;
class mainAbstraction               //object utilization
{
	public static void main(String[] args)
	 {
		mainuser m1=new mainuser();
	    User u1=m1.createpwd(123);
		u1.transaction();
		User u2=m1.createpwd(456);
		u2.transaction();
	 }
}
public interface User 
{
	void transaction();
}

class customer implements User
{
   @Override
   public void transaction()
    {
	System.out.println("customer login successfully!!");
    }
}

class admin implements User
{
    @Override
   public void transaction()
    {   
   System.out.println("admin login !!!");
    }
}

class NewUser implements User
{
   @Override
   public void transaction()
   {   
   System.out.println("Password Wrong or Create new Account");
   }
}

class mainuser                           //object creation for hiding each customer /admin
{
     User u1;                           //global non primitive
     public User createpwd(int pwd)
      {
	   if(pwd==123)
        {
         u1=new customer();
	     return u1;
        }
       else if(pwd==321)
        {
	     u1=new admin();
	     return u1;
        }
       else 
        {
        u1=new NewUser();
        return u1;
        }
       }
}
