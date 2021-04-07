package homework6.task5;

public class Test {
    public static void main(String[] args) {
        Figure circle = new Circle(5.364);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Figure rectangle = new Rectangle(10, 25);
        rectangle.height = 10;
        rectangle.weight = 6.3;
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Figure triangle = new Triangle(8.55,15);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
