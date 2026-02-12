package day05_arrays;
/**
 * Day5Practice - Array Operations and Iteration Examples
 *
 * This class demonstrates fundamental array operations and iteration techniques in Java.
 *
 * Tasks covered:
 * - Create and initialize arrays of primitive types (int) and objects (String)
 * - Iterate through arrays using traditional for loop with index-based access
 * - Iterate through arrays using enhanced for loop (for-each) for cleaner syntax
 * - Calculate the sum of all elements in a numeric array
 * - Find the maximum value in a numeric array
 *
 * Key concepts:
 * - Array declaration and initialization
 * - Array length property
 * - Traditional for loop iteration
 * - Enhanced for loop (for-each) iteration
 * - Array element access and comparison
 */

public class Day5Practice {
    public static void main(String[] args) {
        
        // Create an array of integers with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Loop through the array using for loop
        System.out.println("Numbers in array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // Create an array of strings
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        
        // Loop through array using enhanced for loop (for-each)
        System.out.println("\nFruits in array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Calculate sum of all numbers in array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of all numbers: " + sum);
        
        // Find maximum number in array
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);
    }
}