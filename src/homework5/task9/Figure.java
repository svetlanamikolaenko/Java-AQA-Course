package homework5.task9;
//9) What is the different between static and non-static field of a class?
//Create an example to demonstrate this concept.

public class Figure {
    public static int count;
    public int count1;
    int width;
    int height;

    {
        count++;
        count1++;
    }

    public Figure(int width, int height){
        this.height = height;
        this.width = width;

    }

    public Figure(){
    }

    public int getArea(){
        return width*height;
    }

    public static void main(String[] args) {
        Figure figure = new Figure(10, 5);
        Figure figure1 = new Figure();
        Figure figure2 = new Figure();

        //Static field count is general for all objects of one class
        //it belongs to the Class, not to its instances
        //it calls through Class name (e.g. Figure)
        System.out.println("Static field is general for all objects and belongs to Class Figure: " + Figure.count);
        //A non-static field value can be different for every object of a class.
        System.out.println("Non-static belongs to object: " + figure.count1);
        System.out.println("Non-static belongs to object: " + figure1.count1);
        System.out.println("Non-static belongs to object: " + figure2.count1);
    }
}
