package org.example.SetInterface;

import java.util.*;
public class Code3
{
    public static void main(String[] args)
    {
      HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
      HashSet<Integer> set2 = new HashSet<>(Arrays.asList(9,8,7,6,5,4,3));

      HashSet<Integer> common = new HashSet<>(set1);
      common.retainAll(set2);

        HashSet<Integer> union = new HashSet<>(set1);
         union.addAll(set2);

       union.removeAll(common);

        System.out.println(" Elements after removing common elements :"+ union);
    }
}
