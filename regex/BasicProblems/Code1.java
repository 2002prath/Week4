package org.example.BasicProblems;

import java.util.regex.*;

public class Code1 {

    public static void main(String[] args) {

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}";
      Pattern pattern = Pattern.compile(regex);

        String input = "Pratham_21323 Rahul_2324 Mohan78665 24343";

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
