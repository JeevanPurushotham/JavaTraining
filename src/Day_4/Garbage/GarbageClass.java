package Day_4.Garbage;

public class GarbageClass {
	public static void main(String[] args) 
	{
		GarbageClass g=new GarbageClass();
		g=null;
		GarbageClass a = new GarbageClass();
		GarbageClass b = new GarbageClass();
		b = a;
		System.gc();  
	   }  
}
