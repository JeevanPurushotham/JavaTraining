package Day_2;

public class DoWhile {
	public static void main(String[] args)
    {
        int fib = 0, step = 1, i = 1;
 
        System.out.println("Prints counting from 1 - 10");
        
        do
           System.out.print(i++ + " ");
        while(i <= 10);
 
        System.out.println(); 
        System.out.println("\nPrints fibonacci series up to 50");
        
        do
        {
            System.out.print(fib + " ");
            fib = fib + step;
            step = fib - step;
        }while (fib < 50);
    }
}
