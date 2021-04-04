package homework6.task3;

public class TestCar {
    public static void main(String[] args) {
        SportsCar sportCar = new SportsCar("Volkswagen Golf GTI", "320", 6, 300, 40, 11);
        System.out.println(sportCar.range());
        sportCar.move(160,55, 300,5);
        System.out.println(sportCar.fuelNeeded());
        sportCar.changeGears(4);
        sportCar.setCurrentVelocity(305);
        sportCar.changeGears(7);
        sportCar.changeGears(5);
        System.out.println(sportCar.getCurrentGear());
        sportCar.stop();
        Car sportCar2 = new SportsCar("asd", "dd", 2, 3,2,1);
        ((SportsCar)sportCar2).move(245,180,300,5);
    }
}
