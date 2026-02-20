package day12_exceptionhandling;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws CustomException {

        if (amount > balance) {
            throw new CustomException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
