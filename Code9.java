package org.example;
import java.io.*;

public class Code9 {

        public static void main(String[] args) {

            String filePath = "path/to/largefile.txt";


            String searchWord = "error";

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                int lineNumber = 0;


                while ((line = reader.readLine()) != null) {
                    lineNumber++;

                    if (line.toLowerCase().contains(searchWord.toLowerCase())) {
                        System.out.println("Line " + lineNumber + ": " + line);
                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println("File not found: " + filePath);
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
    }


