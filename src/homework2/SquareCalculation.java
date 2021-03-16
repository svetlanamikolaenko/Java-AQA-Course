package homework2;

public class SquareCalculation {
    public static void main(String[] args) {
        //Square of rectangle
        int length;
        int width;

        do {
            length = (int) Math.round(Math.random() * 10);
        } while (length == 0);

        do {
            width = (int) Math.round(Math.random() * 10);
        } while (width == 0);

        System.out.println("Square of rectangle is: "  + width + " * " + length + " = " + Math.multiplyExact(length, width));

        //Square of circle
        int radius;

        do {
            radius = (int) Math.round(Math.random() * 10);
        } while (radius == 0);

        System.out.println("Square of circle is: "  +  radius  + "^2"+ " * " + Math.PI + " = " + (Math.round((Math.PI * Math.pow(radius, 2))*100.0)/100.00));
    }
}
