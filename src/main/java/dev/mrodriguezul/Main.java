package dev.mrodriguezul;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the fake ATM!");

        String accountNumber = "123456789";
        double balance = 1000.0;
        int pin = 1234;

        int[] transactionAmounts = {100, -200, 300, -400, 500};

        balance+=transactionAmounts[0];
        if(balance > 0 && pin == 1234){
            System.out.println("Welcome, Your balance is: " + balance);
        }

        String status = (balance < 0) ? "overdrawn" : "in credit";
        System.out.println("Your account is " + status);
    }
}
