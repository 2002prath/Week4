package org.example.annotation.builtinannotation.exercise1;

public class Animal {
     void makeSound(){
        System.out.println("Sweet");
    }


}
class Dog extends Animal{
    @Override
    void makeSound(){
    System.out.println("Bark");
}
}

 class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();

    }
}
