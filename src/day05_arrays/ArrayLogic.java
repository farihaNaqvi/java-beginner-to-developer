/**
 * Day 5 – Arrays
 *
 * This module covers fundamental concepts of array data structures and operations.
 *
 * Topics covered:
 * - Array declaration: How to declare arrays of different primitive and object types
 * - Accessing elements: How to read and write array elements using index notation
 *
 * Arrays are fixed-size collections that store multiple values of the same type
 * in contiguous memory locations, accessible via zero-based indexing.
*/
public class ArrayLogic {
    
    public static void main(String[] args) {
        
        // Array Declaration: Creating an array of integers
        // Syntax: dataType[] arrayName = new dataType[size];
        int[] numbers = new int[5]; // Array that can hold 5 integers
        
        // Accessing and Writing Elements: Using index (0-based)
        // Index starts from 0, so for array of size 5, valid indices are 0-4
        numbers[0] = 10;  // First element
        numbers[1] = 20;  // Second element
        numbers[2] = 30;  // Third element
        numbers[3] = 40;  // Fourth element
        numbers[4] = 50;  // Fifth element
        
        // Accessing (Reading) Elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[4]);
        
        // Iterating through array using loop
        System.out.println("\nAll elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // Array of Strings (object type)
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";
        
        System.out.println("\nFruits: " + fruits[1]); // Output: Banana
    }
}


