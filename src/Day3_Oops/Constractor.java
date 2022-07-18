package Day3_Oops;

public class Constractor {
   String Name;
   long Mob;
   String Email;
   
	public static void main(String[] args) {
		Constractor c=new Constractor("Jeevan",12398761);
		Constractor c1=new Constractor("Harish",123456,"H@gmail.com");
		Constractor c2=new Constractor();
	}
	Constractor(String Name,long Mob)
	{
		this.Name=Name;
		this.Mob=Mob;
		System.out.println("Name : "+Name+"\n Mob :"+Mob+"\n");
	}
	Constractor(String Name,long Mob,String Email)
	{
		this.Name=Name;
		this.Mob=Mob;
		this.Email=Email;
		System.out.println("Name : "+Name+"\n Mob :"+Mob+"\n"+Email);
	}
	Constractor()
	{
		System.out.println("\n zero argument Constractor");
	}
}
 