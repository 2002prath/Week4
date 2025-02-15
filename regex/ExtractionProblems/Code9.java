package org.example.ExtractionProblems;

import java.util.regex.Pattern;
public class Code9 {

    public static void main(String[] args) {

            String input = "This is a damn bad example with some stupid words.";


            String[] badWords = {"damn", "stupid"};

            // Censor each bad word
            for (String badWord : badWords) {
                // Create a regex pattern for the bad word (case insensitive)
                String regex = "\\b" + Pattern.quote(badWord) + "\\b";
                input = input.replaceAll("(?i)" + regex, "****");
            }

            // Print the censored sentence
            System.out.println("Censored Sentence: " + input);
        }
    }



