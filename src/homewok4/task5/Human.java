package homewok4.task5;
/*5. Create a simple class with a bunch of constructors.
All these constructors should take different number of parameters.
Demonstrate in your class, how we can call one constructor from another.
 */

public class Human {
    public int weight;
    public int height;
    public int age;
    public String firstName;
    public String lastName;

    public Human (int weight){
        this.weight = weight;
    }

    public Human(int height, int weight){
        this(weight);
        this.height = height;
    }

    public Human(int height, int weight, int age){
        this(weight, height);
        this.age = age;
    }

    public Human(int height, int weight, int age, String firstName){
        this(weight,height,age);
        this.firstName = firstName;
    }

    public Human (int height, int weight, int age, String firstName, String lastName){
        this (height,weight,age,firstName);
        this.lastName = lastName;
    }
}
