package homework6.task5;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.536);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.weight = 6.3;
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle();
        triangle.setBase(8.55);
        triangle.height = 15;
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
