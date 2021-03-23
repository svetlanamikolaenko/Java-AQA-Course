package homewok4.task5;
/*
5. Create a simple class with a bunch of constructors.
All these constructors should take different number of parameters.
Demonstrate in your class, how we can call one constructor from another.
 */
public class Human {
    public int weight;
    public int height;
    public int age;
    public String firstName;
    public String lastName;

    public Human(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Human(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(int age) {
        this.age = age;
    }
}
