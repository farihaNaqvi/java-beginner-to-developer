package day02_control_flow;

/**
 * Day 2 Practice
 *
 * Scenario:
 * Loan eligibility check
 *
 * Conditions:
 * - Salary >= 60,000
 * - Age >= 20

 * Operators you MUST know:
 * && → AND
 * || → OR
 * ! → NOT
 */
public class Day2Practice {
  
  public static void main(String[] args) {

    double salary = 90000;
    int age = 20;

    if (salary >= 60000 && age>=18) {
      System.out.printlln("Loan is Approved");
    }else {
      System.out.println("Loan is rejected");
    }
  }
}
