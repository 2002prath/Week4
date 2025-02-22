package org.example.reflection.basiclevel;

import java.lang.reflect.Method;

public class InvokeAMethod {

    private int add(int a, int b) {
        return a + b;
    }
}

 class Main{

    public static void main(String[] args) {
        try{
            Class cls = Class.forName("org.example.reflection.basiclevel.InvokeAMethod");






        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
