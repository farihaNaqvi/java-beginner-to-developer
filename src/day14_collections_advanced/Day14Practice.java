package day14_collections_advanced;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {

    int price;
    String name;

    Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int compareTo(Product other) {
        return this.price - other.price; // Sort by price
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

public class Day14Practice {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1200, "Phone"));
        products.add(new Product(800, "Headphones"));
        products.add(new Product(1500, "Tablet"));

        Collections.sort(products);

        System.out.println("Sorted by price:");
        System.out.println(products);
    }
}