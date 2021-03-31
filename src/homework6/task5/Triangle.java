package homework6.task5;

public class Triangle extends Figure{
    private double base;

    @Override
    public double calculateArea() {
        return base / 2 * height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
