package day06_oop_basics;

/**
 * Demonstrates object creation
 */
/**
 * Student class definition
 */

public class OOPDemo {

    public static void main(String[] args) {

        Student student1 = new Student("Ali", 24);
        Student student2 = new Student("Ahmed", 26);

        student1.displayInfo();
        System.out.println("-----");
        student2.displayInfo();
    }
}