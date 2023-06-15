package main;

public class Account {
    private int customerNumber;
    private int pin;
    private int balance = 0;

    public Account(int customerNumber, int pin) {
        this.customerNumber = customerNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int deposit(int depositAmount){
        this.balance += depositAmount;
        return balance;
    }

    public int withdrawal(int withdrawalAmount){
        this.balance -= withdrawalAmount;
        return balance;
    }
    public void changePin(int currPin, int newPin){
        if(currPin == pin){
            setPin(newPin);
        }else{
            System.out.println("Incorrect pin");
        }
    }
}
