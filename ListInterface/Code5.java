package org.example.ListInterface;

import java.util.LinkedList;

public class Code5 {
    public static void main(String[] args) {
        char[] letters = {'A','B','C','S','P'};
        LinkedList<Character> list = new LinkedList<>();
        int p=2;
        for(int i=0;i<letters.length;i++)
        {
            list.add(letters[i]);
        }
        System.out.println("Element from end :");
        System.out.println(list.get(list.size()-p));
    }
}
