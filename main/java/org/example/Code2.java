package org.example;

import java.util.Scanner;
public class Code2 {

    public String reverseString(String string)
    {
        if(string == null)
        {
            return null;
        }
        return new StringBuilder(string).reverse().toString();
    }

    public boolean isPalindrome(String string)
    {
         if(string == null)
         {
             return false;
         }
         String reversed = reverseString(string);
         return string.equalsIgnoreCase(reversed);
    }

    public String UpperCase(String inputString)
    {
        if(inputString == null)
        {
            return null;
        }
        return  inputString.toUpperCase();

    }
}
