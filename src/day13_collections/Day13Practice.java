package day13_collections;

import java.util.ArrayList;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Day13Practice {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Arjun"));
        students.add(new Student(2, "Priya"));
        students.add(new Student(3, "Karan"));

        for (Student s : students) {
            System.out.println("ID: " + s.id + " Name: " + s.name);
        }
    }
}
