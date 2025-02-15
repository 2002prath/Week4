package org.example.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code14 {
    public static void main(String[] args) {
        String regex = "^[1-9][0-9-]{16}";
        Pattern pattern = Pattern.compile(regex);

        String input = "2324-3243-334  23424-3434-434 43434-4344-3434";

        Matcher match = pattern.matcher(input);

        boolean found = false;

        while(match.find()) {

            System.out.println("Correct UserId : "+ match.group());
            found = true;
        }

        if (!found) {
            System.out.println("No valid usernames found.");
        }

    }
}
