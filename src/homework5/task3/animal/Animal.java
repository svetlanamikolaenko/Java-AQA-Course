package homework5.task3.animal;
/*
3) Answer the question: What is a package-private access? Create a simple program to demonstrate the package-private access.
Tips:
 - Create two different packages
 - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
 - Create in one of the classes some package-private members(fields or methods).
 - In another two classes create objects of the class with package-private members and try to access its members.
 */

import homework5.task3.pets.Cat;
import homework5.task3.pets.Dog;

public class Animal {
    String name;
    int age;
    String animalType;

    public static void main(String[] args) {
        //Cat cat = new Cat("2", "Charles");
        // error 'Cat(int, java.lang.String)' is not public in 'homework5.task3.pets.Cat'.
        // Cannot be accessed from outside package
        Dog dog = new Dog();//cam create a dog, empty constructor is public be default;

        //this class has no access to methods and fields of Cat and Dog, because its in pets package
        //if you need to get access to methods and fields - should set public access.

    }

}
