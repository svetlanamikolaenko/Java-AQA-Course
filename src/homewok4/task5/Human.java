package homewok4.task5;
/*
5. Create a simple class with a bunch of constructors.
All these constructors should take different number of parameters.
Demonstrate in your class, how we c.
 */
public class Human {
    public int weight;
    public int height;
    public int age;
    public String firstName;
    public String lastName;

    public Human(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Human(String firstName, String lastName) {
        this(25, 55, 170);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}



