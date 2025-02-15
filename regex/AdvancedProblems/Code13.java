package org.example.AdvancedProblems;

public class Code13 {
    public static void main(String[] args) {
        String input = "Rs is indian currency ";

        String[] smallword = input.split("[\\s,]+");
        String[] Words = {"Rs", "$","Euro","Singapore$","taka","derim"};


        for (String word : smallword) {
            for (String lang : Words) {
                if (word.equalsIgnoreCase(lang)) {
                    System.out.println("Currency : " + word);
                }
            }
        }
    }
}
