package ATM;

import java.util.Scanner;

public class KGBA {
	// System.out.println("Account No : "+a1.actno);
	// System.out.println("Holder Name : "+a1.owner);
	static int key = 2345;

	public static void main(String[] args) {
		System.out.println("            WELCOME TO KARNATAKA BANK               ");
		Scanner s = new Scanner(System.in);
		Current a1 = new Current();// bank object
		//Presentbal a2 = new Presentbal();// atm object

		System.out.println("Enter your 4 digit secret key");
		int key1 = s.nextInt();
		if (key1 == key) {
			System.out.println("Press 1 : Balance Inquriy                 Press 3 : Savings balance ");
			System.out.println("Press 2 : Withdraw                        Press 4 : current balance ");
			int a = s.nextInt();
			switch (a) {
			case 1:
				a1.deposit(30000);
				a1.showbal();
				break;
			case 2:
				System.out.println("enter the amount");
				int drawamt = s.nextInt();
				a1.deposit(30000);
				a1.withdraw(drawamt);
				break;
			case 3:
				a1.deposit(30000);
				a1.calculator();
				break;
			case 4:
				a1.deposit(30000);
				a1.showbal();
				break;
			default:
				System.out.println("entered invalid number");
			}
		} else
			System.out.println("entered wrong key");
	}
}

class Account {
	long actno = 120281000119l;
	double bal = 500000;
	String owner = "PAVANKUMAR M R";

	public void deposit(int amt) {
		bal = bal + amt;
		// System.out.println("total current bal : "+bal);
	}

	public void withdraw(int drawamt) {
		bal = bal - drawamt;
		System.out.println("dedit amt : " + drawamt);
		System.out.println("after balance : " + bal);
	}
}

/// subclases of bank account
class Savings extends Account//
{
	double roi = 3;

	public void calculator() {
		roi = bal * 1 * roi / 100;
		bal = bal - roi;
		System.out.println("total current savings bal : " + bal);
	}

}

class Current extends Savings {
	double min_bal = 1000;

	public void showbal() {
		System.out.println("current balance : " + bal);
		bal = bal - min_bal;
		System.out.println("available current balance : " + bal);
	}
}
