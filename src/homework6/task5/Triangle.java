package homework6.task5;

public class Triangle extends Figure{

    public Triangle(double weight, double height) {
        super(weight, height);
    }
    @Override
    public double calculateArea() {
        return getWeight() / 2 * getHeight();
    }
}
