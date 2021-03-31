package homewok4.task2;
/*

2. Implement the method fight() depending on weight, strength and age of the boxer:
You should write the dependency by yourself. The method should return true or false if our boxer won or lost.
Requirements:
a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
 */

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        // write your code here
        if ((strength >= anotherBoxer.strength && weight >= anotherBoxer.weight)
                || (weight > anotherBoxer.weight && age <= anotherBoxer.age)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(20,90,56);
        Boxer anotherBoxer = new Boxer (19, 95, 55);
        System.out.println(ourBoxer.fight(anotherBoxer));
    }
}

