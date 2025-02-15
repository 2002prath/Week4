package org.example.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Code15 {
    public static void main(String[] args) {

                String input = "This is is a repeated repeated word test.";

                // Split the input text into words based on spaces and punctuation
                String[] words = input.split("[\\s,;.!?]+");

                // Create a set to store unique words
                Set<String> seenWords = new HashSet<>();
                Set<String> repeatedWords = new HashSet<>();

                // Iterate over the words and check if the word is repeated
                for (String word : words) {
                    if (!seenWords.add(word.toLowerCase())) {
                        repeatedWords.add(word.toLowerCase());
                    }
                }

                // Print the repeated words
                if (!repeatedWords.isEmpty()) {
                    System.out.println("Repeated Words: " + String.join(", ", repeatedWords));
                } else {
                    System.out.println("No repeated words found.");
                }
            }
        }


