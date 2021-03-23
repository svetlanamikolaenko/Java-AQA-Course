package homewok4.task1;
/*1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
Requirements:
a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
b) Add to the class a constructor with parameters which initialize all the fields.
*/

public class Human {
    public int weight;
    public int height;
    public int age;
    public String firstName;
    public String lastName;

    public Human(int weight, int height, int age, String firstName, String lastName) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
