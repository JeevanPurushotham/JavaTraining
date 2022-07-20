package Day_3Oops;

public class StaticKeyword {
	static String UnivercityNo="4PS18EC406";
	String Branch;
  public void FirstMethod(String Branch)
  {
	  this.Branch=Branch;
	  System.out.println("Univercity Nunber :"+UnivercityNo +"\n Branch Name : "+Branch);
  }
  public void SecondMethod()
  {  
	  String UnivercityNo="12345";
	  System.out.println("Univercity Nunber :"+UnivercityNo +"\n Branch Name : "+Branch);
  }
  public void LastMethod()
  {
	  System.out.println("Univercity Nunber :"+ UnivercityNo +"\n Branch Name : "+Branch);
  }
  
  public static void main(String[] args) {
	  StaticKeyword s=new StaticKeyword();
	  s.FirstMethod("ECE");
	  s.SecondMethod();
	  s.LastMethod();
}
}
