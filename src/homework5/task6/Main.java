package homework5.task6;

public class Main {
    public static void main(String[] args) {
        Box box = Box.createBox();
        box.setWidth(5);
        box.setHeight(10);
        System.out.println(box.getSquare());
    }
}
