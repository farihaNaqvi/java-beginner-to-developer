package day03_loops;

/**
 * Topics covered:
 * - do-while loop
 * - executes at least once
 */

public class DoWhileLogic {

  public static void main(String[] args) {

    int attempt = 0;
    
    do{
      System.out.println("Login attempt: " + (attempt + 1));
      attempt++;
    }while (attempt < 3);
  }
}
