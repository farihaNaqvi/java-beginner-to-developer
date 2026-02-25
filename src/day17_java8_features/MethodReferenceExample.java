package day17_java8_features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rahul", "Anita", "Karan");

        // Using lambda
        names.forEach(name -> System.out.println(name));

        // Using method reference
        names.forEach(System.out::println);
    }
}