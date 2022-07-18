package Day_1;

public class F_Program {

	public static void arithmetic(int a, int b) {
		// TODO Auto-generated method stub
        int c=0;
        c=a+b;
        System.out.println("Addition of two Number : "+c);
        c=a-b;
        System.out.println("substraction of two Number : "+c);
        c=a/b;
        System.out.println("Division of two Number : "+c);
        c=a*b;
        System.out.println("multiplication of two Number : "+c);
        c=a%b;
        System.out.println("modulus of two Number : "+c);
	}
	public static void main(String[] args) {
		arithmetic(10,20);
		System.out.println(".................................");
		arithmetic(5,7);
	}

}
