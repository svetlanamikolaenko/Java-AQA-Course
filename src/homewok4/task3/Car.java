package homewok4.task3;
/*3. Create 3 different classes to demonstrate the relationships "has-a" and "uses-a". They can be anything you want.
For example: Car - Engine - Wheels
 */

public class Car {
    //Aggregation(has-a)
    Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public static void main(String[] args) {
        //Dependency(uses-a)
        Wheels wheels = new Wheels(16.5);
        double wheelsDiameter = wheels.getDiameterOfWheels();
        System.out.println(wheelsDiameter);

        //Aggregation(has-a)
        Engine engine = new Engine("Petrol");
        Car car = new Car(engine);
        System.out.println(car.engine.type);
    }
}
