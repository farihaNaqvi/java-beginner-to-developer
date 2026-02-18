package day10_abstraction;

// Abstract class
public abstract class Shape {

    // Abstract method (no body)
    public abstract void draw();

    // Concrete method
    public void display() {
        System.out.println("Displaying shape...");
    }
}
