package homework6.task5;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round((Math.pow(radius, 2)* Math.PI)*100.00)/100.0;
    }
}
