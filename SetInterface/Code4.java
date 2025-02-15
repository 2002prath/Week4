package org.example.SetInterface;

import java.util.*;
public class Code4 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(201);
        set.add(821);
        set.add(81);
        set.add(51);

        List<Integer> sortedlist = new ArrayList<>(set);

        Collections.sort(sortedlist);

        System.out.println("Sorted List : "+ sortedlist);
    }
}
