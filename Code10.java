package org.example;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Code10 {

        public static void main(String[] args) {
            // File path for the text file
            String filePath = "path/to/textfile.txt";

            // Map to store word frequencies
            HashMap<String, Integer> wordCountMap = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;

                // Read file line by line
                while ((line = reader.readLine()) != null) {
                    // Split the line into words
                    String[] words = line.split("\\s+");

                    for (String word : words) {
                        // Normalize words (convert to lowercase and remove punctuation)
                        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

                        if (!word.isEmpty()) {
                            // Increment word count in the map
                            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                        }
                    }
                }

                // Sort the map by values (frequency) in descending order
                List<Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
                sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

                // Display the total word count
                System.out.println("Total words: " + wordCountMap.size());

                // Display the top 5 most frequent words
                System.out.println("Top 5 most frequently occurring words:");
                int count = 0;
                for (Entry<String, Integer> entry : sortedEntries) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                    count++;
                    if (count == 5) break;
                }

            } catch (FileNotFoundException e) {
                System.err.println("File not found:  Please check the file details " + filePath);
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }
    }


