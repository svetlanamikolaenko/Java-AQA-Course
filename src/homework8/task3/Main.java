package homework8.task3;
/*
3. Finish the program to handle all the possible exceptions:
public class Main {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        int b = 10 / a;
        int[] c = {1};
        System.out.println(c[1]);

    }
}
Print the cause of the exception to the console.
 */

public class Main {
    public static void main(String[] args) {
        int a = args.length;
        try {
            System.out.println(a);
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index not exists");
        }
        catch (Exception e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
