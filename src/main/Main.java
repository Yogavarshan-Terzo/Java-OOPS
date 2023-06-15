package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number :");
        int account_number = scanner.nextInt();
        System.out.println("Enter secret PIN :");
        int pin = scanner.nextInt();
        ATM atm = new ATM(account_number,pin);
        atm.run();
    }
}