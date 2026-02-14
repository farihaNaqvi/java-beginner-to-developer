
/**
 * Demonstrates encapsulation usage
 */
public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Ali", 10000);

        account.deposit(5000);
        account.withdraw(3000);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
