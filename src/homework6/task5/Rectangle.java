package homework6.task5;

public class Rectangle extends Figure{

    public Rectangle(double weight, double height) {
        super(weight, height);
    }

    @Override
    public double calculateArea(){
        return getHeight() * getWeight();
    }
}
