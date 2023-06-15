package main;

import java.text.NumberFormat;
import java.util.Scanner;

public class ATM extends Account {
    public ATM(int customerNumber, int pin) {
        super(customerNumber, pin);
    }
    Account account;
    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Balance");
        System.out.println("4. Change PIN");
        System.out.println("5. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;


        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    account.withdrawal(withdrawAmount);
                    break;
                case 3:
                    int balance = account.getBalance();
                    System.out.println(NumberFormat.getCurrencyInstance().format(balance));
                    break;
                case 4:
                    System.out.print("Enter your current PIN: ");
                    int currentPin = scanner.nextInt();
                    System.out.print("Enter your new PIN: ");
                    int newPin = scanner.nextInt();
                    account.changePin(currentPin,newPin);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }

}
