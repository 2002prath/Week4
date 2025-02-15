package org.example.ExtractionProblems;

import java.util.regex.*;

public class Code4 {
    public static void main(String[] args) {
        String email = "[A-Za-z0-9_]+@[a-z]{1,}\\.[a-z]{2,}";

        Pattern pattern = Pattern.compile(email);
        String input = "My id is pratham1111@gmail.com";

        Matcher match = pattern.matcher(input);

        while(match.find())
        {
            System.out.println("found email : "+ match.group());
        }
    }
}
