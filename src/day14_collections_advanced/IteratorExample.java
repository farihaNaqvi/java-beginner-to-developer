package day14_collections_advanced;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Anita");
        names.add("Karan");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}