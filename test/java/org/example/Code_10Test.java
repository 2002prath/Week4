package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Code_10Test {

    Code_10 checker = new Code_10();

    @Test
    public void celsiuschecker()
    {
     assertEquals(77,checker.CelsiusConverter(25));
    }

    @Test
    public void farenhitechecker()
    {
        assertEquals(25,checker.FarenhiteConverter(77));
    }
}
