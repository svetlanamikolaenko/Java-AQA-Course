package homework5.task7.figure;
/*
7) What is the difference between package-private access and protected access?
 */
//In protected  - have access to all class methods and fields in same package and subclasses outside the package through inheritance
//In package-private - have access to all class  fields and methods only in same package
public class Figure {
    protected int width;
    protected int height;
    String string;

    protected Figure() {
    }

    protected Figure(String string) {
        this.string = string; ;
    }
}
