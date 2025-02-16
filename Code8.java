package org.example;

public class Code8 {


        public static void main(String[] args) {
            try {
                // Calling method2() from main()
                method2();
            } catch (ArithmeticException e) {
                // Handling the exception in main()
                System.out.println("Handled exception in main");
            }
        }

        public static void method1() {
            // Throwing ArithmeticException in method1 (division by zero)
            int result = 10 / 0;  // This will throw ArithmeticException
        }

        public static void method2() {
            // Calling method1(), which will throw ArithmeticException
            method1();
        }
    }


