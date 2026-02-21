package day13_collections;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Rahul");
        students.put(2, "Anita");
        students.put(3, "Vikram");

        System.out.println("Student with ID 2: " + students.get(2));

        // Iterating map
        for (Integer key : students.keySet()) {
            System.out.println("ID: " + key + " Name: " + students.get(key));
        }
    }
}
