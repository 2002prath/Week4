package org.example.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code6 {
    public static void main(String[] args) {
        String date = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}\\b";

        Pattern pattern = Pattern.compile(date);
        String input = "Today date is 30/02/2025 and 42/34/9000";

        Matcher match = pattern.matcher(input);

        while(match.find())
        {
            System.out.println("found Date : "+ match.group());
        }
    }
}
