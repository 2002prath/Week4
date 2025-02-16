package org.example;

    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Code5 {

    public static void main(String[] args) {
            // Path to the file
            String filePath = "info.txt";

            // Using try-with-resources to automatically close resources
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                // Read the first line of the file
                String firstLine = br.readLine();

                // Check if the file has content
                if (firstLine != null) {
                    System.out.println("First line of the file: " + firstLine);
                } else {
                    System.out.println("The file is empty.");
                }
            } catch (IOException e) {
                // If the file does not exist or there is an I/O issue
                System.out.println("Error reading file");
            }
        }
    }


