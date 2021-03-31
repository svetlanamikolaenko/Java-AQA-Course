package homework6.task1;
/*1) Write a simple java program to demonstrate composition of classes.
Tips:
 a) Create several classes A, B, C;
 b) Add functionality of classes B and C to the class A without using inheritance.
 c) Create a test class and demonstrate how we can use functionality of classes B and C via created object of the class A;
 */

public class TestClass {
    public static void main(String[] args) {
        B b = new B("Name", 1);
        C c = new C("hello class C", 2);

        A a = new A(b, "Hello class A");
        A a1 = new A();
        A a2 = new A(c);

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);

    }
}
