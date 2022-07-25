package Day_5;

public class Exeption {
	public static void main(String[] args) {
		try { // try block -- used to write risk code.
			int FirstNumber = 10;
			int SecondNumber = 0;
			int Output = FirstNumber / SecondNumber;
			System.out.println("Output : " + Output);
		} catch (ArithmeticException e) { // catch block -- used to alternate code.
			System.out.println("Handled");
		} finally // finally block.
		{
			System.out.println("it is executed irrespective of occurance of exception");
		}
	}
}
