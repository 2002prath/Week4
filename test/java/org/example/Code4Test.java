package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Code4Test {
     Code4  checker = new Code4();

     @Test
    public void exception()
     {
         assertEquals(2,checker.divide(6,3));
         assertEquals(12,checker.divide(144,12));

         Exception exception = assertThrows(ArithmeticException.class, () -> {
             checker.divide(5, 0);
         });
         assertEquals("Division by zero is not allowed.", exception.getMessage());
     }

}
