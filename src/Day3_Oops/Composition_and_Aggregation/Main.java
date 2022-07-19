package Day3_Oops.Composition_and_Aggregation;

public class Main {
	public static void main(String[] args)
	{
		CompositionAndAggregation bank = new CompositionAndAggregation("Josh Software");
		Employee1 emp = new Employee1("Jeevan P");
		System.out.println(emp.getEmployeeName()
						+ " is employee of "
						+ bank.getBankName());
	}
}
