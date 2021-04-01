package homework6.task3;

public class SportsCar extends Car {
    //private int currentVelocity;
    //private int currentDirection;

    public SportsCar(String name, String size) {
        super(name, size);
        //this.currentVelocity = currentVelocity;
        //this.currentDirection = currentDirection;

    }

//    public void setCurrentVelocity(int currentVelocity) {
//        this.currentVelocity = currentVelocity;
//    }
//
//    public void setCurrentDirection(int currentDirection) {
//        this.currentDirection = currentDirection;
//    }
//
//    @Override
//    public int getCurrentVelocity() {
//        return currentVelocity;
//    }
//
//    @Override
//    public int getCurrentDirection() {
//        return currentDirection;
//    }

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Reno", "1500");
//        sportsCar.setCurrentDirection(100);
//        sportsCar.setCurrentVelocity(1200);
       // System.out.println("Direction: " + sportsCar.getCurrentDirection() + " and Velocity: " + sportsCar.currentVelocity);
        sportsCar.move(150, 300);
        sportsCar.steer(450);
        sportsCar.stop();

    }
}
