package org.example.AdvancedProblems;

import java.util.regex.*;

public class Code11 {
    public static void main(String[] args) {

       String visa = "\\b4\\d{15}";
       String masterCard = "\\b5\\d{15}";

       Pattern pattern = Pattern.compile(visa);

       String input = "4222222222222222324242";
       Matcher match = pattern.matcher(input);

       while(match.find())
       {
           System.out.println("Card found ");

       }


    }
}
