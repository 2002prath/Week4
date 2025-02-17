package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Code3Test {

    Code3 list = new Code3();
    @Test
    public void  Testadd()
    {
      List<Integer> listmanager = new ArrayList<>();
      list.addElement(listmanager,5);
      assertTrue(listmanager.contains(5));
    }

    @Test
    public void  Testremove()
    {
        List<Integer> listmanager = new ArrayList<>();
        list.removeElement(listmanager,5);
        assertFalse(listmanager.contains(5));
    }

    @Test
    public void  Testsize()
    {
        List<Integer> listmanager = new ArrayList<>();
        list.size(listmanager);
        assertEquals(1,list.size(listmanager));
    }

}
