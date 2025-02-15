package org.example.MapInterface;

import java.util.*;

import java.io.*;

public class Code1 {
    public static void main(String[] args) {
        // Replace with the path to your text file
        String filePath = "input.txt";

        // Map to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Normalize the line: remove punctuation, convert to lowercase
                line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

                // Split the line into words
                String[] words = line.split("\\s+");

                // Count each word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Print the word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

