package org.example.SetInterface;

import java.util.*;

public class Code2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3,3,4,5,6,7,7,6,5,4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,78,8,9));

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of Both Sets : \n"+ union);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of both sets : \n"+ intersection);
    }
}
