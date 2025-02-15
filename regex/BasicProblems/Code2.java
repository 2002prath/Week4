package org.example.BasicProblems;
import java.util.Scanner;
import java.util.regex.*;

public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String regex = "^[A-Z]{2}\\d{4}$";

       Pattern pattern = Pattern.compile(regex);
        System.out.println("Enter Number plate ");
       String input = sc.nextLine();

       Matcher match = pattern.matcher(input);

       if(match.matches())
       {
           System.out.println("Valid Licence Plate : "+ match.group());
       }

    }
}
