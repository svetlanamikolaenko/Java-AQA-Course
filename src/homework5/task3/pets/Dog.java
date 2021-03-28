package homework5.task3.pets;

public class Dog {
    int age;
    String name;

    public static void main(String[] args) {
        Cat cat = new Cat(5, "Richard");//have access in the same package to Cat methods and fields
        cat.jump();
        cat.run();
    }
}
