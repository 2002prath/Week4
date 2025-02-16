package org.example;
import java.io.*;

public class Code6 {

        public static void main(String[] args) {
            // Input and output file paths
            String inputFilePath = "input.txt";   // Replace with the path to your input file
            String outputFilePath = "output.txt"; // Replace with the path to your output file

            // Character encoding
            String encoding = "UTF-8";

            try (
                    // Initialize FileReader and BufferedReader for input
                    FileReader fileReader = new FileReader(inputFilePath, java.nio.charset.Charset.forName(encoding));
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    // Initialize FileWriter and BufferedWriter for output
                    FileWriter fileWriter = new FileWriter(outputFilePath, java.nio.charset.Charset.forName(encoding));
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
            ) {
                String line;

                // Read each line from the input file
                while ((line = bufferedReader.readLine()) != null) {
                    // Convert the line to lowercase and write it to the output file
                    bufferedWriter.write(line.toLowerCase());
                    bufferedWriter.newLine(); // Add a new line to match the original format
                }

                System.out.println("File processed successfully. Output written to: " + outputFilePath);
            } catch (IOException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }
    }


