package org.example;
import java.io.*;

public class Code3 {

        public static void main(String[] args) {
            // File to store the user input
            String fileName = "userInfo.txt";

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                 FileWriter fileWriter = new FileWriter(fileName)) {

                // Ask user for their details
                System.out.println("Enter your name: ");
                String name = reader.readLine();

                System.out.println("Enter your age: ");
                String age = reader.readLine();

                System.out.println("Enter your favorite programming language: ");
                String favoriteLanguage = reader.readLine();

                // Save the details into the file
                fileWriter.write("User Details:\n");
                fileWriter.write("Name: " + name + "\n");
                fileWriter.write("Age: " + age + "\n");
                fileWriter.write("Favorite Programming Language: " + favoriteLanguage + "\n");

                System.out.println("User information saved to " + fileName);

            } catch (IOException e) {
                System.err.println("An error occurred while reading input or writing to the file: " + e.getMessage());
            }
        }
    }


