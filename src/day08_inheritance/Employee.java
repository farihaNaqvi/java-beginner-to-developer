package day08_inheritance;

/**
 * Child class extending Person
 */
public class Employee extends Person {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);   // Call parent constructor
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }
}
