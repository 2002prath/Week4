package org.example.ListInterface;
import java.util.*;
public class Code3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        int x = 7;
        for(int i=0;i<array.length;i++)
        {
            list.add(array[i]);
        }
        int y = list.indexOf(x);
        list.clear();
        for(int j=y;j<array.length;j++)
        {
            list.add(array[j]);
        }
        for(int p=0;p<y;p++)
        {
            list.add(array[p]);
        }
        System.out.println("Original List of Elements ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

        System.out.println("\n Rotated Elements are :"+ list);
    }
}
