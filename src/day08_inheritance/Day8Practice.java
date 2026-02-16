package day08_inheritance;
/**
 * Day8Practice class demonstrates the concept of inheritance in Java.
 * 
 * This class contains examples of:
 * - A base class (Vehicle) with common properties and methods for all vehicles
 * - A derived class (Car) that extends Vehicle and overrides the start() method
 * - Method overriding to provide specialized behavior for Car objects
 * 
 * The main method creates a Car instance, sets its properties (brand, model, year),
 * and calls the overridden start() method to display the car's information.
 * 
 * Key Concepts:
 * - Inheritance: Car inherits from Vehicle
 * - Polymorphism: start() method is overridden in Car class
 * - Property Access: Demonstrates accessing inherited properties from parent class
 */
public class Day8Practice {

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2023;
        car.start();
    }

    static class Vehicle {
        String brand;
        int year;

        void start() {
            System.out.println("Vehicle is starting...");
        }
    }

    static class Car extends Vehicle {
        String model;

        @Override
        void start() {
            System.out.println("Car is starting: " + brand + " " + model + " (" + year + ")");
        }
    }
}

// OUTPUT - Car is starting: Toyota Camry (2023)
