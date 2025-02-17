package org.example;

import java.util.List;

public class Code3 {

    public boolean addElement(List<Integer> list,int element)
    {
        list.add(element);

        if(list.contains(element))
        {
            return true;
        }
        else
            return false;
    }

    public boolean removeElement(List<Integer> list, int element)
    {
        list.remove(element);

        if(list.contains(element))
        {
            return false;
        }
        else
            return true;
    }

    public  int size(List<Integer> list)
    {
       return list.size();
    }
}
