package org.example.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code8 {

        public static void main(String[] args) {


            String input = "My     name          is             Pratham";

            String result = input.replaceAll("\\s+", " ");


                System.out.println("Modified String : "+ result);

    }
}
