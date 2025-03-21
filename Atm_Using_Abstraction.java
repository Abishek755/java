package Java;

import java.util.*;

abstract class Atm { // Parent class
    double balance;

    Atm(double balance) { // Parent constructor
        this.balance = balance;
    }

    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract void check_balance();
}

class SBI extends Atm {

    SBI(double balance) { // Child class constructor
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Available balance: " + balance);
        } else {
            System.out.println("Insufficient Funds.");
        }
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Available balance: " + balance);
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    @Override
    void check_balance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Atm_Using_Abstraction {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SBI obj = new SBI(1000); // Initial amount

        while (true) {
            System.out.println("-------ATM Menu-----");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("-------------------");

            System.out.print("Enter Your Choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmt = s.nextDouble();
                    obj.withdraw(withdrawAmt);
                    break;

                case 2:
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmt = s.nextDouble();
                    obj.deposit(depositAmt);
                    break;

                case 3:
                    obj.check_balance();
                    break;

                case 4:
                    System.out.println("Thanks for using SBI ATM");
                    s.close(); // Close the scanner after use
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
