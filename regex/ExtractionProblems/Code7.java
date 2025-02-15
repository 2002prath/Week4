package org.example.ExtractionProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Code7 {

    public static void main(String[] args) {

            String web = "https?://[a-zA-Z0-9\\\\-\\\\.]+\\\\.[a-zA-Z]{2,}(/[a-zA-Z0-9\\\\]-._~:/?#\\\\[\\\\]@!$&'()*+,;=]*)?\n";

            Pattern pattern = Pattern.compile(web);
            String input = "https://chatgpt.com/c/67af15a5-5520-8004-9e1d-89bd442402a4";

            Matcher match = pattern.matcher(input);

            while(match.find())
            {
                System.out.println("found Date : "+ match.group());
            }
        }
    }

