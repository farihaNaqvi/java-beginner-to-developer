
/**
 * BankAccount class represents a simple bank account with basic operations.
 * 
 * This class encapsulates account holder information and balance management.
 * It provides functionality to deposit funds, withdraw funds, and retrieve
 * account details. All balance modifications include validation to ensure
 * only valid transactions are processed.
 * 
 * Attributes:
 *   - accountHolder: The name of the account owner
 *   - balance: The current balance in the account
 * 
 * Key Operations:
 *   - deposit(double): Adds a positive amount to the account balance with validation
 *   - withdraw(double): Deducts an amount from balance only if it's positive and doesn't exceed current balance
 *   - getBalance(): Returns the current account balance
 *   - getAccountHolder(): Returns the name of the account holder
 * Example Usage:
 *   BankAccount account = new BankAccount("John Doe", 1000.00);    
 */
public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}