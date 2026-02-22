package day14_collections_advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    int salary;
    String name;

    Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(50000, "Raj"));
        employees.add(new Employee(70000, "Simran"));
        employees.add(new Employee(40000, "Arjun"));

        // Sort by salary
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.salary - e2.salary;
            }
        });

        System.out.println(employees);
    }
}