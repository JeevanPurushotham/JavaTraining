package Day_1;

public class Swap {

	public static void test(int a,int b) {
		// 
      System.out.println("Before swaping a :"+a+ ", b :"+b);
      System.out.println();
      a=a^b;
      b=a^b;
      a=a^b;
      System.out.println("After swaping  a :"+a+ ", b :"+b);
	}
 public static void main(String[] args) {
      test(10,20);
}
}
