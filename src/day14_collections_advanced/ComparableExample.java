package day14_collections_advanced;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Sort by ID
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Amit"));
        students.add(new Student(1, "Riya"));
        students.add(new Student(2, "Vikram"));

        Collections.sort(students);

        System.out.println(students);
    }
}