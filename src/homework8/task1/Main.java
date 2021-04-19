package homework8.task1;
/*
1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception.
Arithmetic ex, Exception ex;

void method(int number) {
    if (number < 0) ...
    else if (number == 0) ...
}

 */

public class Main {

    public static void main(String[] args) {
        method(-10);
        method(0);
        method(5);
    }

    static void method(int number){
        if (number < 0) System.out.println("Number < 0");
        else if (number > 0) System.out.println(" Number > 0");
        else throw new ArithmeticException();
    }
}
