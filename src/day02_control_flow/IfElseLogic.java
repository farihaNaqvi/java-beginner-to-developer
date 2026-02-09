package day02_control_flow;

/**
 * Day 2 – Control Flow
 *
 * Topics covered:
 * - if / else conditions
 * - comparison operators
 * - decision making
 */
public class IfElseLogic {

    public static void main(String[] args) {

        int balance = 15000;

        if (balance >= 9000) {
            System.out.println("Transaction is allowed");
        } else {
            System.out.println("Balance is insufficient");
        }
    }
}

