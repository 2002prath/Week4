package org.example.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code5 {
    public static void main(String[] args) {
        String email = "\\b[A-Z][a-zA-Z]*\\b";

        Pattern pattern = Pattern.compile(email);
        String input = "My Name is Pratham Mishra ";

        Matcher match = pattern.matcher(input);

        while(match.find())
        {
            System.out.println("found UpperCase Word : "+ match.group());
        }
    }
}
