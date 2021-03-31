package homework6.task5;
/*
5) Create an abstract class Figure.
Add fields width and height to it.
Add an abstract method "calculateArea" which should be overridden by the concrete figures to calculate its area.
Figures: Rectangle, Triangle, Circle
 */

public abstract class Figure {
    public double weight;
    public double height;

    public abstract double calculateArea();
}
