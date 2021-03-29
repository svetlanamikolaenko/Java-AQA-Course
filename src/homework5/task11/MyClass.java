package homework5.task11;
/*
1) Create a class with two different methods and two fields. One of methods should be static, another - non-static.
The same thing should be done with class fields(first - static, second - non-static).
These two methods should change the corresponding fields of the class when called.
Create another class with main method to test your code.
 */

public class MyClass {
    static int staticField;
    int dynamicField;

    static void change(int value) {
        // should change corresponding field
        System.out.println("Static method");
        staticField++;
    }

    void anotherChange(int value) {
        // should change corresponding field
        System.out.println("Non-static method");
        dynamicField++;
    }
}
