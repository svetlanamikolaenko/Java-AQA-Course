package homework6.task3;

public abstract class Car extends Vehicle{
    private int maxGears;
    private int maxSpeed;
    private int fuelCapacity;
    private int fuelPerKilometer;
    private  int currentGear;

    public Car(String name, String size, int maxGears, int maxSpeed, int fuelCapacity, int fuelPerKilometer) {
        super(name, size);
        this.maxGears = maxGears;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.fuelPerKilometer = fuelPerKilometer;
        this.currentGear = 0;
    }

    public abstract int range();

    public abstract double fuelNeeded();

    public abstract void changeGears(int gear);

    @Override
    public void stop(){
        super.stop();
        System.out.println("Car is stopped!");
    }

    public int getMaxGears() {
        return maxGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getFuelPerKilometer() {
        return fuelPerKilometer;
    }
}
