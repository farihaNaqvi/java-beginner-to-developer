package day15_filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Hello from Java File Handling!\n");
            writer.write("This is Day 15 practice.");

            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}