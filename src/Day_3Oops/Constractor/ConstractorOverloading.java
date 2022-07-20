package Day_3Oops.Constractor;

public class ConstractorOverloading {
 String Name;
 long MobNo;
 String PassWord;
 ConstractorOverloading(String Name)
 {
	 this.Name=Name;
	 System.out.println("Name : "+Name);
 }
 ConstractorOverloading(String Name,long MobNo)
 {
	 this.Name=Name;
	 this.MobNo=MobNo;
	 System.out.println("Name : "+Name+" Mob NO :"+MobNo);
 }
 ConstractorOverloading( String Name,long MobNo,String PassWord)
 {
	 this.Name=Name;
	 this.MobNo=MobNo;
	 this.PassWord=PassWord;
	 System.out.println("Name : "+Name+" Mob NO :"+MobNo+" PassWord : "+PassWord);
 }
 public static void main(String[] args) {
	 ConstractorOverloading c=new ConstractorOverloading("Jeevan P");
	 ConstractorOverloading c1=new ConstractorOverloading("Jeevan P",1234567);
	 ConstractorOverloading c2=new ConstractorOverloading("Jeevan P",12456,"jvjf5214");
	 
}
}
