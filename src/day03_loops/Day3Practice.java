package day03_loops;

/**
 * Day 3 Practice
 *
 * Tasks:
 * - Print numbers from 1 to 10
 * - Calculate sum of numbers from 1 to 10
 */

public class Day3Practice {

  public static void main(String[] args) {

    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      Syetem.out.println(i);
      sum +=i;
    }

    System.out.println("Sum = " + sum);
  }
}
