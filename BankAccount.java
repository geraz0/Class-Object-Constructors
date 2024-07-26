//public class BankAccount {
//    private String accountHolder;
//    private double balance;
//
//    // Constructor
//    public BankAccount(String accountHolder, double balance) {
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//    }
//
//    // Method to deposit money
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    // Method to withdraw money
//    public void withdraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//        } else {
//            System.out.println("Insufficient funds.");
//        }
//    }
//
//    // Override toString method to print account details
//    @Override
//    public String toString() {
//        return accountHolder + "'s Account Balance: $" + String.format("%.2f", balance);
//    }
//
//    // Main method to test the BankAccount class
//    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("My Account", 500);
//        myAccount.deposit(100);
//        System.out.println(myAccount); // Should output: My Account's Account Balance: $600.00
//    }
//}


//Bank Transfer Code:

// This class represents a bank account
public class BankAccount {
    // These are the properties of the bank account
    public String accountHolder;
    public double balance;

    // Constructor to initialize the bank account
    public BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
        System.out.println(accountHolder + "'s account opened with $" + initialBalance);
    }

    // Method to add money to the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into " + accountHolder + "'s account. Total balance is now $" + balance);
    }

    // Method to remove money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + accountHolder + "'s account. Remaining balance is $" + balance);
        } else {
            System.out.println("Failed to withdraw $" + amount + " from " + accountHolder + "'s account due to insufficient funds.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println(accountHolder + "'s current balance: $" + String.format("%.1f", balance));
    }
}
