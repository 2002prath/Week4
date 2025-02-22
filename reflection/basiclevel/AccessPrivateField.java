package org.example.reflection.basiclevel;

import java.lang.reflect.Field;

class Person{
    private int age ;

    public Person(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}



public class AccessPrivateField {
    public static void main(String[] args) {
        try {

            Class cls = Class.forName("org.example.reflection.basiclevel.Person");

            Field fields[] = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field : " + field.getName() );
            }

            Person person = new Person(25);

            Field ageField = cls.getDeclaredField("age");
            ageField.setAccessible(true);

            int currAge = (int)ageField.get(person);
            System.out.println("Current age : " + currAge);

            ageField.set(person , 30);
            int modiAge = (int) ageField.get(person);
            System.out.println("Modify age : " + modiAge);


        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
