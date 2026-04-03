// Write a program to implement the Multiple Inheritance kind of framework (Bank Interface, Customer and Account classes) in Java.

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

interface Customer {
    void displayInfo();
}

class Account implements Bank, Customer {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    @Override
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: $" + balance);
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        // Create an Account object that implements both Bank and Customer interfaces
        Account account = new Account("ACC001", "John Doe", 5000);
        
        System.out.println("=== Customer Information ===");
        account.displayInfo();
        
        System.out.println("\n=== Banking Operations ===");
        account.deposit(1000);
        System.out.println();
        
        account.withdraw(500);
        System.out.println();
        
        account.checkBalance();
    }
}
