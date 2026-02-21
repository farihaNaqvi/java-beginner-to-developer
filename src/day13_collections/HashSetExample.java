package day13_collections;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("John");
        names.add("Alice");
        names.add("John"); // duplicate

        System.out.println("Names: " + names);
    }
}
