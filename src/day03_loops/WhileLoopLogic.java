package day03_loops;

/**
 * Topics covered:
 * - while loop
 * - condition-based repetition
 */

public class WhileLoopLogic {
  
  public static void main(String[] args) {

    int balance = 4000;

    while (balance > 0) {
      System.out.println("Balance remaining: " + balance);
      balance -= 1000;
    }
  }
}
