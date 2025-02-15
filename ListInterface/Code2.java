package org.example.ListInterface;

import java.util.HashMap;

public class Code2 {
    public static void main(String[] args) {
        HashMap<String,Integer> frequency= new HashMap<>();
        String[] words = {"apple","banana","apple","pineApple","apple"};
        for(int i=0;i<words.length;i++)
        {
            if(frequency.containsKey(words[i]))
            {
                frequency.put(words[i],frequency.get(words[i])+1);
            }
            else
            {
                frequency.put(words[i],1);
            }
        }
        System.out.println(frequency);
    }
}
