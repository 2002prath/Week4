package org.example.AdvancedProblems;

import java.util.regex.Pattern;
import java.util.*;

public class Code12 {
    public static void main(String[] args) {
        String input = "I know several programming languages like java,c,html,css";

        String[] smallword = input.split("[\\s,]+");
        String[] Words = {"java", "python","javascript","c","sql","ruby","CObol"};


        for (String word : smallword) {
            for (String lang : Words) {
                if (word.equalsIgnoreCase(lang)) {
                    System.out.println("Programming Language Candidate Know: " + word);
                }
            }
        }


    }
}
