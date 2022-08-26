package com.josh.miniproject.atm.Atm;

import java.util.Scanner;

public class Transaction {
    // this method receives amount from database
    static Double transaction(double Amount) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            // options to execute
            System.out.println("1.Deposit \n2.Withdrow\n3.Check Balance\nEnter your choice: ");
            // taking option
            int n = scanner.nextInt();

            switch (n) {
                case 1:// for deposit
                    System.out.print("Enter amount: ");
                    Double depositAmount = scanner.nextDouble();
                    if (depositAmount % 100 != 0) {
                        System.out.println("Enter multiple of 100, 200, 500, 2000");
                        break;
                    }
                    Amount += depositAmount;
                    System.out.println(depositAmount + " /- deposited successfully");
                    break;
                case 2:// Withdraw
                    System.out.print("Enter amount: ");
                    Double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount % 100 != 0) {
                        System.out.println("Enter multiple of 100, 200, 500, 2000");
                        break;
                    }
                    if (withdrawAmount > Amount) {
                        System.out.println("Insufficient balance");
                        break;
                    }
                    Amount -= withdrawAmount;
                    System.out.println(withdrawAmount + " /- withdrew successfully");
                    break;
                case 3:// checking balance
                    System.out.println("Balance: " + Amount);
                    break;
                default:
                    System.out.println("You have enterd invalid choice");
            }

            System.out.print("Want to continue?? /Enter 1 for yes, any other for no/: ");
            int choice = scanner.nextInt();

            System.out.println();
            if (choice != 1)
                break;
        } // closed while-block
        System.out.println("Thank you, visit again");
        scanner.close();

        // returning amount to main class for updating the value in database
        return Amount;
    } // closed method
}
