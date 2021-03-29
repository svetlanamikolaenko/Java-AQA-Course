package homework5.task7.rectangle;


import homework5.task7.figure.Figure;

public class Rectangle extends Figure {
    public Rectangle(){
        //have access to protected methods and fields through inheritance
        System.out.println(width);
        System.out.println(height);
    }

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        rectangle.width = 10;
        //But no access package-private fields and methods
        //For example:
        //rectangle.string = "Hello";
        //'string' is not public in 'homework5.task7.figure.Figure'. Cannot be accessed from outside package
    }
}
