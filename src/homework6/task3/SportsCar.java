package homework6.task3;

public class SportsCar extends Car {
    private int currentDistance;

    public SportsCar(String name, String size) {
        super(name, size);
        this.currentDistance = 0;
    }

    public SportsCar(String name, String size, int maxGears, int maxSpeed, int fuelCapacity, int fuelPerKilometer) {
        super(name, size, maxGears, maxSpeed, fuelCapacity, fuelPerKilometer);
    }

    public void move(int velocity, int direction, int distance, int gear) {
            setCurrentVelocity(velocity);
            setCurrentDirection(direction);
            System.out.println( getName() + " moving at " + getCurrentVelocity() + " in direction " + getCurrentDirection());
            currentDistance = distance;
            setCurrentGear(gear);
            System.out.println("The distance to move " + currentDistance + " on  " + getCurrentGear() + " gear.");
    }

    @Override
    public int range() {
        System.out.print(getName() + " can move with full fuel capacity for distance in km: ");
        return getFuelCapacity() * getFuelPerKilometer();
    }

    @Override
    public double fuelNeeded() {
        System.out.print("Fuel needed for distance " + currentDistance + " km ");
        return (currentDistance * 1.0 / getFuelPerKilometer());
    }

    @Override
    public void changeGears(int gear) {
        if(gear <= getMaxGears()){
            setCurrentGear(gear);
            System.out.println("Gear is switched to: " + getCurrentGear());
        } else {
            System.out.println("Can't switch gear to " + gear + " max gear  " + getMaxGears());
            System.out.println("Current gear not changed and equals to: " + getCurrentGear());
        }

    }

    @Override
    public void setCurrentVelocity(int currentVelocity) {
        if (currentVelocity <= getMaxSpeed()){
        super.setCurrentVelocity(currentVelocity);
        } else {
            System.out.println(getName() + " can't move with speed more than max speed " + getMaxSpeed());
            System.out.println("Current  velocity not changed: " + getCurrentVelocity());
        }
    }
}
