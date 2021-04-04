package homework5.task11;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass myClass1 = new MyClass();

        MyClass.change(MyClass.staticField);
        System.out.println(MyClass.staticField);

        myClass.anotherChange(myClass.dynamicField);
        System.out.println(myClass.dynamicField);

        MyClass.change(MyClass.staticField);
        System.out.println(MyClass.staticField);

        myClass1.anotherChange(myClass1.dynamicField);
        System.out.println(myClass1.dynamicField);
    }
}
