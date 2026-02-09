package day02_control_flow;

/**
 * Topics covered:
 * - switch statement
 * - cleaner conditional logic
 */

public class SwitchLogic {

  public static void main(String[] args) {

    int option = 3;

    switch(option) {
      case 1:
        System.out.println("View Statement");
        break;
      case 2:
        System.out.println("Check Balance");
        break;
      case 3:
        System.out.println("Transfer Money");
        break;
      default:
        System.out.println("Invalid option");
    }
  }
}
