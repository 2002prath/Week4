package org.example;

//import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Code1Test {



        Code1 calculator = new Code1();

        @Test
        public void testAdd() {
            assertEquals(5, calculator.add(2, 3));
            assertEquals(0, calculator.add(0, 0));
            assertEquals(-1, calculator.add(-2, 1));
        }

        @Test
        public void testSubtract() {
            assertEquals(2, calculator.subtract(5, 3));
            assertEquals(-1, calculator.subtract(0, 1));
            assertEquals(-5, calculator.subtract(-2, 3));
        }

        @Test
        public void testMultiply() {
            assertEquals(6, calculator.multiply(2, 3));
            assertEquals(0, calculator.multiply(0, 5));
            assertEquals(-6, calculator.multiply(-2, 3));
        }

        @Test
        public void testDivide() {
            assertEquals(2, calculator.divide(6, 3));
            assertEquals(0, calculator.divide(0, 5));

            // Exception test for division by zero
            Exception exception = assertThrows(ArithmeticException.class, () -> {
                calculator.divide(5, 0);
            });
            assertEquals("Division by zero is not allowed.", exception.getMessage());
        }
    }


