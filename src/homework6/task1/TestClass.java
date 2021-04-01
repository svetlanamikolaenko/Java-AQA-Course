package homework6.task1;
/*1) Write a simple java program to demonstrate composition of classes.
Tips:
 a) Create several classes A, B, C;
 b) Add functionality of classes B and C to the class A without using inheritance.
 c) Create a test class and demonstrate how we can use functionality of classes B and C via created object of the class A;
 */

public class TestClass {
    public static void main(String[] args) {
        ClassB classB = new ClassB("Name", 1);
        ClassC classC = new ClassC("hello class C", 2);

        ClassA classA = new ClassA(classB, "Hello class A");
        ClassA classA1 = new ClassA();
        ClassA classA2 = new ClassA(classC);
        ClassA classA3 = new ClassA(classB, "stringA",classC,3);

        System.out.println(classA);
        System.out.println(classA1);
        System.out.println(classA2);
        System.out.println(classA3);
    }
}
