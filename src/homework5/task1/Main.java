package homework5.task1;
/*1) Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
Create a third class with the main method.
In the main method create two different objects of your classes specifying the full name of the classes (including packages).
 */

import homework5.task1.net.java.Human;
import homework5.task10.Final;
import homework5.task7.figure.Figure;

public class Main {
    public static void main(String[] args) {
        homework5.task1.com.Human human = new homework5.task1.com.Human();
        homework5.task1.net.java.Human human1 = new homework5.task1.net.java.Human();
    }
}
