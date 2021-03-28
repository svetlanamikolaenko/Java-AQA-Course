package homework5.task5;
/*
5) Answer the question: What is a private access? Create a simple program to demonstrate the private access.
Tips:
 - Create two classes
 - In on of them create private members
 - In the second class create an object of the first class
 - Try to access the private members
 */

public class A {
    public static void main(String[] args) {
        //B b = new B();//error: 'B()' has private access in 'homework5.task5.B'
        //Have no access to fields and methods in B class
        // need to set in class B  public or package-private access to get fields or method

        //For example:
        // string has package-private access
        // number has public access
        //constructor with number and string has package-private access
        B b = new B("B", 5);

    }
}
