package day06_oop_basics;

/**
 * Student class - represents a student with basic information
 * Day 6 – OOP Basics
 *
 * Topics covered:
 * - Class creation
 * - Instance variables
 * - Constructor
 * - Method inside class
 */
public class Student {

    // Instance variables to store student data
    String name;
    int age;

    // Constructor - initializes a Student object with name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method - displays student information to console
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
