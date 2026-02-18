package day10_abstraction;

// Abstract class
abstract class Bank {

    abstract void calculateInterest();

    void bankInfo() {
        System.out.println("Bank provides financial services");
    }
}

// Child class 1
class SBI extends Bank {

    @Override
    void calculateInterest() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

// Child class 2
class HDFC extends Bank {

    @Override
    void calculateInterest() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class Day10Practice {

    public static void main(String[] args) {

        Bank bank1 = new SBI();
        Bank bank2 = new HDFC();

        bank1.bankInfo();
        bank1.calculateInterest();

        bank2.bankInfo();
        bank2.calculateInterest();
    }
}
