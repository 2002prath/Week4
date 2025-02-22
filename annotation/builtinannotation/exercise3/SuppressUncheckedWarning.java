package org.example.annotation.builtinannotation.exercise3;

import java.util.ArrayList;

public class SuppressUncheckedWarning {

    @SuppressWarnings("unchecked")  //  Correct spelling
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();  // Use lowercase "list"

        list.add("Hello");
        list.add(10);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
