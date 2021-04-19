package homework8.task6;
/*
Write a program that will enter numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.

If the user entered some text, instead of entering a number, the method should catch the exception and display all
previously entered numbers as a result.
Numbers output from a new line preserving the order of input.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void readData() {
        Scanner in = new Scanner(System.in);

        boolean inputValid = false;

        while (!inputValid) {
            String input = in.next();
            try {
                int number = Integer.parseInt(input);
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("You didn't enter a valid integer.");
                break;
            }
        }
    }

    public static void main(String[] args) {
       readData();
    }
}
