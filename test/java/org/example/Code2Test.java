package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class Code2Test {

    Code2 stringchecker = new Code2();

    @Test
    public void Testreverse()
    {
        assertEquals("olleh",stringchecker.reverseString("hello"));
        assertEquals("itika",stringchecker.reverseString("ritika"));
        assertEquals("mar",stringchecker.reverseString("ram"));
    }

    @Test
    public void TestPalindrome()
    {
        assertEquals("noon",stringchecker.isPalindrome("Noon"));

    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringchecker.UpperCase("hello"));
        assertEquals("WORLD", stringchecker.UpperCase("World"));
        assertEquals("", stringchecker.UpperCase("")); // Empty string
        assertNull(stringchecker.UpperCase(null)); // Null input
    }
}
