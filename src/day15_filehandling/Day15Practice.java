package day15_filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Day15Practice {

    public static void main(String[] args) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("app.log", true));

            writer.write("Application started at: " + LocalDateTime.now());
            writer.newLine();

            writer.close();

            System.out.println("Log entry added");

        } catch (IOException e) {
            System.out.println("Logging failed: " + e.getMessage());
        }
    }
}