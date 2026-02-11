package day04_methods;

/**
 * Topics covered:
 * - Methods with return type
 * - Returning values
 */

public class ReturnLogic {

  public static void main(String[] args) {
    
    int result = addNumbers(10, 20);
    System.out.println("Sum = " + result);
  }

  public static int addNumbers(int a, int b) {
    return a + b;
  }
}
