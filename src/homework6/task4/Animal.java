package homework6.task4;
/*4) Create a class A. Add several fields, two methods and parameterized constructors to it. Create a class B that extends class A.
Demonstrate in you program how class's B constructor should call class's A constructor to create a new object.
 Override one method of the class A to fully change it's behavior.
  Override another method to add some extra functionality to it, but it should then call class's A method.
 Create a test class and create several objects of class A and class B and call their methods.

 */

public class Animal {

    private String name;
    private int weight;
    private boolean isDomestic;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.isDomestic = false;
    }


    public void makeSound(){
        System.out.println( name + " is making sound!");
    }

    public void sleep(){
        System.out.println(name + " is sleeping!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    @Override
    public String toString() {
        return "Animal " + name;
    }
}
