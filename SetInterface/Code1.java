package org.example.SetInterface;

import java.util.*;
public class Code1
{
    public static boolean check(HashSet<Integer> h1,HashSet<Integer> h2)
    {
       if(h1.equals(h2))
           return true;
       else
           return false;
    }
    public static void main(String[] args)
    {
       HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
       HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(check(set1,set2));
    }
}

