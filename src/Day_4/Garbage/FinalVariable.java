package Day_4.Garbage;

public class FinalVariable {
		  public static void main(String[] args) {

		    // create a final variable
		    final int AGE = 32;

		    // try to change the final variable we will get below Exception
		    
		    //AGE = 45;   
		    // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			//The final local variable AGE cannot be assigned. It must be blank and not using a compound assignment
		    System.out.println("Age: " + AGE);
		  }
		}

