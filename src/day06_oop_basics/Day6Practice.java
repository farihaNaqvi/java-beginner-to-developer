
/**
 * Day6Practice demonstrates basic OOP (Object-Oriented Programming) concepts using a BankAccount class.
 * 
 * This class serves as a practice exercise for Day 6, covering the following OOP fundamentals:
 * - Object instantiation: Creating multiple instances of the BankAccount class
 * - Encapsulation: Accessing private account data through public getter methods
 * - Object behavior: Performing deposit and withdrawal operations on bank accounts
 * - State management: Tracking and displaying account balances before and after transactions
 * 
 * The program creates two bank accounts, performs various transactions (deposits and withdrawals),
 * and displays the account holder names and their updated balances.
 */
public class Day6Practice {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 1000.00);
        BankAccount account2 = new BankAccount("Jane Smith", 500.00);

        System.out.println(account1.getAccountHolder() + " has a balance of: " + account1.getBalance());
        System.out.println(account2.getAccountHolder() + " has a balance of: " + account2.getBalance());

        account1.deposit(200.00);
        account1.withdraw(150.00);

        account2.deposit(300.00);
        account2.withdraw(100.00);

        System.out.println(account1.getAccountHolder() + " has a balance of: " + account1.getBalance());
        System.out.println(account2.getAccountHolder() + " has a balance of: " + account2.getBalance());
    }
}
/**
 * Expected Output:
 * John Doe has a balance of: 1000.0
 * Jane Smith has a balance of: 500.0
 * Deposited: 200.0
 * Withdrew: 150.0
 * Deposited: 300.0
 * Withdrew: 100.0
 * John Doe has a balance of: 1050.0
 * Jane Smith has a balance of: 700.0
 */