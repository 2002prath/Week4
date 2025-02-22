package org.example.reflection.basiclevel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Field.*;
import java.lang.reflect.Method;
import java.util.Scanner;



class Student{
       public String name;
       public int age;

       public Student(String name , int age){
           this.name = name;
           this.age = age;
       }

       private int add(int a, int b){
           return a+b;
       }

}
public class GetClassInfo {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the class Name : ");
            String className = sc.nextLine();

            Class cls = Class.forName(className);
            System.out.println("Class Name : " + cls.getName());

            Constructor constructors[] = cls.getDeclaredConstructors();

            for(Constructor constructor : constructors) {
                System.out.println("Constructor name " + constructor.getName());

            }

            Field fields[] = cls.getFields();
            for(Field field : fields){
                System.out.println("Fields : " + field);
            }

            Method methods[] = cls.getDeclaredMethods();
            for(Method method : methods){
                System.out.println("Method : " + method.getName());
            }





        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }





    }



}
