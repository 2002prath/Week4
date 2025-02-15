package org.example.SpecialQuestions;

import java.util.*;

public class Code3 {

    // Method to add a product to the cart
    public static void addProduct(Map<String, Double> cart, String product, double price) {
        cart.put(product, price);
    }

    // Method to display items in the order added using LinkedHashMap
    public static void displayItemsInOrder(Map<String, Double> cart) {
        System.out.println("Items in the order they were added:");
        cart.forEach((product, price) ->
                System.out.println(product + ": $" + price));
    }

    // Method to display items sorted by price using TreeMap
    public static void displayItemsSortedByPrice(Map<String, Double> cart) {
        TreeMap<Double, String> sortedCart = new TreeMap<>();

        // Store price as key and product as value in TreeMap (to sort by price)
        cart.forEach((product, price) -> sortedCart.put(price, product));

        System.out.println("Items sorted by price:");
        sortedCart.forEach((price, product) ->
                System.out.println(product + ": $" + price));
    }

    public static void main(String[] args) {
        // Using LinkedHashMap to maintain insertion order
        Map<String, Double> cart = new LinkedHashMap<>();

        // Adding products to the cart
        addProduct(cart, "Apple", 1.99);
        addProduct(cart, "Banana", 0.99);
        addProduct(cart, "Cherry", 3.49);
        addProduct(cart, "Dates", 2.99);

        // Displaying items in insertion order
        displayItemsInOrder(cart);

        // Displaying items sorted by price
        displayItemsSortedByPrice(cart);
    }
}
