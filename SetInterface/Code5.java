package org.example.SetInterface;

import java.util.*;
public class Code5 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,9));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> set3 = new HashSet<>();

        set1.retainAll(set2);
        set3.addAll(set1);
        System.out.println("This code will check that both sets are equal or not ");
        System.out.println(set1.equals(set3));
    }
}
