package homework6.task4;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Rusty", 5);
        animals[1] = new Cat("Richard", 2);
        animals[2] = new Animal("Beer", 250);
        animals[3] = new Animal("Cow", 100);

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.sleep();
            System.out.println();
        }
    }
}
