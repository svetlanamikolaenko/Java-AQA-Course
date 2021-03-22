package homework2;

public class SquareCalculation {
    /*Create a simple program that calculates and prints the square of a rectangle and a circle.
    Import and use Math class.
     */
    public static void main(String[] args) {
        //Square of rectangle
        int length = 10;
        int width = 6;
        System.out.println("Square of rectangle is: "  + width + " * " + length + " = " + Math.multiplyExact(length, width));

        //Square of circle
        int radius = 8;
        System.out.println("Square of circle is: "  +  radius  + "^2"+ " * " + Math.PI +
                " = " + (Math.round(Math.PI * Math.pow(radius, 2)*100.0)/100.00));
    }
}
