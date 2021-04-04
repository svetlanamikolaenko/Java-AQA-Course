package homework5.task4.animal;
import homework5.task4.pets.Cat;
import homework5.task4.pets.Dog;
/*
4) Answer the question: What is a public access? Create a simple program to demonstrate the public access.
You can use tips from the task 3.
 */

public class Animal {
    Cat cat;

    public Animal(Cat cat){
        this.cat = cat;
    }

    public static void main(String[] args) {
        //no errors
        //Method in class Cat is public abd visible outside of package
        Animal cat = new Animal(new Cat("Black",3));
        System.out.println("Cat: age: " + cat.cat.age + " and name: " + cat.cat.name);
        cat.cat.run();

        //no errors
        //Method in class Dog is public abd visible outside of package
        Dog dog = new Dog();
        dog.bark();

    }
}


