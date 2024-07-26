// This class is used to demonstrate transferring money between two bank accounts
public class BankTransfer {
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount larrysAccount = new BankAccount("Larry", 5000);
        BankAccount marysAccount = new BankAccount("Mary", 300);

        // Display initial balances
        System.out.println("\nInitial Balances:");
        larrysAccount.displayBalance();
        marysAccount.displayBalance();

        // Perform transactions
        System.out.println("\nTransferring Money:");
        larrysAccount.withdraw(100);  // Larry withdraws $100
        marysAccount.deposit(100);    // $100 is deposited into Mary's account

        // Display final balances after transactions
        System.out.println("\nFinal Balances:");
        larrysAccount.displayBalance();
        marysAccount.displayBalance();
    }
}
