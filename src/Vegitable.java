package Day_4.FullOopsConceptProgram;

public interface Vegitable { // interface class
	public abstract void carrot(); // abstract methods

	public abstract void Tomato();
}

abstract class CarrotOne implements Vegitable // abstract class implementing interface class
{
	@Override // Annotation keyword used for comparing super interface class method and
				// subclass method
	public void carrot() { // first implementing method
		System.out.println("it is Orange color");
		System.out.println("it is sweet");
		System.out.println("it help keep blood sugar levels under control");
	}

	public abstract void Tomato(); // we are not implementing method here because this is not required for this
									// class
}

class Tomoto extends CarrotOne // using extends keyword we build relation between two class
{
	@Override
	public void Tomato() {
		System.out.println("it is red color");
		System.out.println("it is sweet and sour");
		System.out.println(" it is low in calories and rich in vitamin C");

	}
}

class Human implements Vegitable // human class implementing vegetable interface
{
	@Override
	public void carrot() {
		System.out.println("Human eat carrot for good health");
	}

	@Override
	public void Tomato() {
		System.out.println("Human eat Tomato for vitamin C ");
	}
}

class FullOopsConcept {
	public static void main(String[] args) { // main method for give access to all method
		Vegitable v = new Human();      //Upcasting
		v.carrot();
		v.Tomato();
	}
}
