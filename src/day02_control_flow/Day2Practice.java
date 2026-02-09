package day02_control_flow;

/**
 * Day 2 Practice
 *
 * Scenario:
 * Loan eligibility check
 *
 * Conditions:
 * - Salary >= 60,000
 * - Age >= 18
 * - CIBIL score is true
 *
 * Operators you MUST know:
 * && → AND
 * || → OR
 * ! → NOT
 */
public class Day2Practice {
  
  public static void main(String[] args) {

    double salary = 90000;
    int age = 20;
    boolean hasCibilScore = true;

    if (salary >= 60000 && age>=18 && hasCibilScore) {
      System.out.println("Loan is Approved");
    }else {
      System.out.println("Loan is rejected");
      System.out.println("Your salary or age does not meet our eligibility criteria.");
    }
  }
}
