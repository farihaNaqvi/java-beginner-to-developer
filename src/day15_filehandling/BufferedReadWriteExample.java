package day15_filehandling;

import java.io.*;

public class BufferedReadWriteExample {

    public static void main(String[] args) {

        try {

            // Writing using BufferedWriter
            BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"));
            writer.write("Buffered Writing Example");
            writer.newLine();
            writer.write("Second line of text");
            writer.close();

            // Reading using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader("buffered.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}