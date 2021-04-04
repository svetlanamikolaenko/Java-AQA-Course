package homework5.task8;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(25);
        System.out.println(human.getAge());
        human.setEmail("human@gmail.com");
        System.out.println(human.getEmail());

        Human human1 = new Human(25, "Svitlana", "Mykolaienko", 6050496,"sveta@gmail.com");
        System.out.println("My phone number: " + human1.getPhoneNumber());
        human1.setPhoneNumber(2555555);
        System.out.println("My changed phone number: " + human1.getPhoneNumber());
    }
}
