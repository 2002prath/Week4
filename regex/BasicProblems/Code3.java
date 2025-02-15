package org.example.BasicProblems;

import java.util.Scanner;
import java.util.regex.*;
public class Code3 {

    public static void main(String[] args) {
        String regex = "^#[a-fA-F0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);

        String input = "#FF1234";

        Matcher match = pattern.matcher(input);
        //boolean found = false;
        if(match.matches())
        {
            System.out.println(" Code is correct ");
           // found = true;
        }
        else
            System.out.println("Valid code  not found ");
    }
}
