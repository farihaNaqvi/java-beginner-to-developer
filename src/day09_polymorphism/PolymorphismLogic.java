package day09_polymorphism;
/**
 * Demonstrates method overriding and runtime polymorphism in Java.
 * 
 * This class showcases how polymorphism allows objects of different types
 * to be treated uniformly through a common parent class reference.
 * 
 * Key concepts illustrated:
 * - Method Overriding: Dog and Cat classes override the sound() method
 *   from the Animal parent class with their own implementations.
 * - Upcasting: Dog and Cat objects are assigned to Animal references,
 *   enabling polymorphic behavior.
 * - Runtime (Dynamic) Polymorphism: The actual method executed is determined
 *   at runtime based on the object's actual type, not the reference type.
 *   Although a1 and a2 are Animal references, calling sound() invokes
 *   the overridden methods in Dog and Cat respectively.
 * 
 * Output demonstrates that each object responds appropriately to the
 * same method call based on its actual runtime type.
 */

public class PolymorphismLogic {
    public static void main(String[] args) {
        Animal a1 = new Dog();   // Upcasting
        Animal a2 = new Cat();   // Upcasting

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }

    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }
}
