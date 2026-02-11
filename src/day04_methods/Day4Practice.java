package day04_methods;

/**
 * Day 4 Practice
 *
 * Scenario:
 * Check loan eligibility using method
*/

public class Day4Practice {

  public static void main(String[] args) {

    boolean approved = checkLoanEligibility(90000, 22, true);

    if (approved) {
      System.out.println("Loan is Approved");
    }else {
      System.out.println("Loan is Rejected");
    }
  }

  public static boolean checkLoanEligibilty(double salary, int age, boolean hasCibil) {

    if (salary >= 50000 && age >= 18 && hasCibil) {
      return true;
    }else {
      return false;
    }
  }
}
