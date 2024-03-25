/*
   Create a class called BankAccount to represent a simple bank account.
   The class should have private attributes for account number and balance,
   a constructor to initialize these attributes, and methods to deposit and withdraw money from the account.
   Additionally, implement encapsulation using appropriate getter and setter methods for balance.
   Demonstrate the usage of the BankAccount class in the main method by creating an object,
   performing transactions, and printing out the balance.
 */

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
