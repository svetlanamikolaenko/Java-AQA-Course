package homework6.task4;

public class Cat extends Animal{
    public Cat(String name, int size) {
        super(name, size);
        setDomestic(true);
    }

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

    @Override
    public void sleep(){
        System.out.println("purr purr purr");
    }

    @Override
    public String toString(){
        return "Cat name " + getName()
                + " weight " + getWeight();
    }
}
