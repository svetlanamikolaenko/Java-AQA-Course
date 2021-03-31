package homework5.task6;
/*
6) Create a new class. Make it impossible to create a new object of this class using a constructor.
Provide an appropriate public method that will allow clients of your class create a new object.
 */


public class Box {
    private int width;
    private int height;

    private Box (){

    }

    public static Box createBox(){
        return new Box();
    }

    //Private method that NOT allows clients to use this method
    private int square(int width, int height){
        return width*height;
    }

    //Public methods that  allows clients of your class create a new object
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSquare(){
        return square(width,height);
    }
}
