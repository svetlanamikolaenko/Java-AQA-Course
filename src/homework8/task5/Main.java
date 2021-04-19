package homework8.task5;
/*
5. Throw a NullPointerException from the method iCanThrowException();
Handle it in the main method.
public class Main {

    public static void main(String[] args) {
        iCanThrowException();
    }

    public static void iCanThrowException() {

    }

}
 */

public class Main {

    public static void main(String[] args) {
        String str1 = null;
        try {
            iCanThrowException(str1);
        }
        catch (NullPointerException e){
            System.out.println("Provided " + e.getMessage());
        }
    }

    public static void iCanThrowException(String argument) {
        if (argument == null || argument.isEmpty()) throw new NullPointerException();
    }
}
