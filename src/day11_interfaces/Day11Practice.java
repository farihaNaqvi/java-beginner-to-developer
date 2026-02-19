package day11_interfaces;

interface Payment {
    void pay(double amount);
}

interface Refund {
    void refund(double amount);
}

class CreditCard implements Payment, Refund {

    @Override
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund processed to Credit Card: $" + amount);
    }
}

public class Day11Practice {

    public static void main(String[] args) {

        CreditCard cc = new CreditCard();

        cc.pay(1000);
        cc.refund(200);
    }
}
