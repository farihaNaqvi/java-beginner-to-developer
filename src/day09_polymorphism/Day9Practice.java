package day09_polymorphism;
/**
 * Day9Practice - Polymorphism Example using Vehicle Topic
 * 
 * This class demonstrates method overriding and polymorphism in Java through a Vehicle hierarchy.
 * 
 * Class Hierarchy:
 * - Vehicle (Parent class): Defines the contract for all vehicles with start() and stop() methods
 * - Car (Child class): Implements vehicle operations specific to cars
 * - Bicycle (Child class): Implements vehicle operations specific to bicycles
 * - Boat (Child class): Implements vehicle operations specific to boats
 * 
 * Key Concepts Demonstrated:
 * 1. Inheritance: Child classes (Car, Bicycle, Boat) extend the parent Vehicle class
 * 2. Method Overriding: Each child class overrides start() and stop() methods with their own implementations
 * 3. Polymorphism: Parent class references (Vehicle) hold child class objects, enabling dynamic method dispatch
 * 4. Runtime Binding: The correct overridden method is called based on the actual object type at runtime
 * 
 * Main Method Flow:
 * - Creates three Vehicle references pointing to different child class objects
 * - Calls start() and stop() methods on each reference
 * - Demonstrates that the same method call executes different code based on the actual object type
 * 
 * Output Example:
 * - Car engine starts with ignition key
 * - Car brakes applied smoothly
 * - Bicycle starts by pedaling
 * - Bicycle stops by applying hand brakes
 * - Boat engine starts with propeller
 * - Boat slows down by reversing propeller
 */
// Day9Practice.java - Polymorphism Example using Vehicle Topic

// Parent class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
    
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Child class 1
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine starts with ignition key");
    }
    
    @Override
    public void stop() {
        System.out.println("Car brakes applied smoothly");
    }
}

// Child class 2
class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle starts by pedaling");
    }
    
    @Override
    public void stop() {
        System.out.println("Bicycle stops by applying hand brakes");
    }
}

// Child class 3
class Boat extends Vehicle {
    @Override
    public void start() {
        System.out.println("Boat engine starts with propeller");
    }
    
    @Override
    public void stop() {
        System.out.println("Boat slows down by reversing propeller");
    }
}

public class Day9Practice {
    public static void main(String[] args) {
        // Polymorphism: Parent reference can hold child objects
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bicycle();
        Vehicle vehicle3 = new Boat();
        
        // Same method call, different implementations
        vehicle1.start();  // Car specific start
        vehicle1.stop();   // Car specific stop
        
        vehicle2.start();  // Bicycle specific start
        vehicle2.stop();   // Bicycle specific stop
        
        vehicle3.start();  // Boat specific start
        vehicle3.stop();   // Boat specific stop
    }
}
