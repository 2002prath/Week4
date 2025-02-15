package org.example.ListInterface;

import java.util.*;
public class Code4 {
    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>();
        int[] array = {1,1,1,1,2,3,3,4,5,6,7,7,2,2};



        for(int i=0;i<array.length;i++)
        {
           if(!list2.contains(array[i]))
           {
               list2.add(array[i]);
           }
        }
        System.out.println("List of original Elements ");
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println("List of  Unique Elements using Arraylist : "+ list2);

    }
}
