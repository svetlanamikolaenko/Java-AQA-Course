package homework5.task7;

import homework5.task7.figure.Figure;
import homework5.task7.rectangle.Rectangle;

public class Square {

    Figure figure;

    public Square(Figure figure) {
        this.figure = figure;
    }

    public void main() {
        Square square = new Square(figure);
        //No access to Figure width and height outside the package and without inheritance
        //square.figure.width = 10;
        //'width' has protected access in 'homework5.task7.figure.Figure'
        ///No access to package-private fields and methods
        //square.figure.string = "Hello";
        //'string' is not public in 'homework5.task7.figure.Figure'. Cannot be accessed from outside package

    }
}


