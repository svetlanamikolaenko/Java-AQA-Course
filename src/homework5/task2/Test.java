package homework5.task2;
/*
2) Take the classes from the task 1. Create a new test class.
Import everything (*) from your created packages.
Now try to create objects of your classes without specifying the packages in front of the class names.
 What happened? How can we avoid this?
 */


import homework5.task1.com.*;
import homework5.task1.net.java.*;

public class Test {
    public static void main(String[] args) {
        //Human human = new Human();
        //Error appears:
        //Reference to 'Human' is ambiguous, both 'homework5.task1.com.Human' and 'homework5.task1.net.java.Human' match.
        //So, we should specify class in import and specify the full name of the classes (including packages)
    }
}
