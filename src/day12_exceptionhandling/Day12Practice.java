package day12_exceptionhandling;

public class Day12Practice {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1500);
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
