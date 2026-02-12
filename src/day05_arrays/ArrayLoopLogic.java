package day05_arrays;
/**
 * Topics covered:
 * - Iterating over array
 */
public class ArrayLoopLogic {

    public static void main(String[] args) {
        // Example 1: Traditional for loop
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Example 2: Enhanced for loop (for-each)
        System.out.println("\nEnhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Example 3: While loop
        System.out.println("\nWhile loop:");
        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
    }
}