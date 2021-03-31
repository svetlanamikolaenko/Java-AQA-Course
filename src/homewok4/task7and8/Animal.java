package homewok4.task7and8;
/*7. Create a simple class with some fields.
Demonstrate in your class how we can use initialization blocks.

8. Find the information about the order of initialization, when you create a new object of a class:
When constructors, initialization blocks are being executed.
When fields are initialized with default values.
 */

public class Animal {
    public static int count;
    public int age;
    public String name;

    {
        System.out.println("Starting inicialization block");
        count++;
        System.out.println("Animals count: " + count);
    }

    public Animal(int age, String name){
        System.out.println("Starting constructors with parameters");
        this.age = age;
        this.name = name;
    }

    public Animal(){
        System.out.println("Starting empty constructor");
    }

}
