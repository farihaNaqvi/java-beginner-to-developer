package day17_java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int salary;
    String name;

    Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}

public class Day17Practice {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(50000, "Raj"),
                new Employee(70000, "Simran"),
                new Employee(40000, "Arjun")
        );

        List<Employee> highSalary = employees.stream()
                .filter(e -> e.salary > 50000)
                .collect(Collectors.toList());

        System.out.println("Employees with salary > 50000:");
        highSalary.forEach(e -> System.out.println(e.name + " - " + e.salary));
    }
}