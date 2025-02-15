package org.example.AdvancedProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code10 {

    public static void main(String[] args) {
        String visa = "\\b[0-255]{4}";


        Pattern pattern = Pattern.compile(visa);

        String input = "000-234-2434-534";
        Matcher match = pattern.matcher(input);

        while(match.find())
        {
            System.out.println("Ip address  found ");

        }
    }
}
