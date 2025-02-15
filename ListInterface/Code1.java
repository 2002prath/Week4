package org.example.ListInterface;

import com.sun.security.jgss.GSSUtil;

import java.util.*;


public class Code1 {

    public static void main(String[] args) {
    ArrayList<Integer> input  = new ArrayList<>();
    LinkedList<Integer> linked = new LinkedList<>();
    int[] array = {1,2,3,4,5,6,7,8,9};
    int[] arr = {11,12,13,14,15,16,18,19,20};
    for(int i=array.length-1;i>=0;i--)
    {
        input.add(array[i]);
    }

    for(int i=arr.length-1;i>=0;i--)
    {
        linked.add(arr[i]);
    }
        System.out.println("Original Array :"  );
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ,");
        }
        System.out.println("Reversed ArrayList : ");
        System.out.println(input);
        System.out.println();
        System.out.println("Original Array for linked list ");
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i] + " ,");

        }
        System.out.println("\n Reversed Linked List : ");
        System.out.println(linked);
    }
}
