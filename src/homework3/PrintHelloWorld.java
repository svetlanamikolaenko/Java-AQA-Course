package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintHelloWorld {
    /*
    10. Write a program which prints "Hello world" to the console
    using methods transformIntToChar and printList only.
     */
    public static void main(String[] args) {
        // write your code here
        String word = "Hello world";
        char[] wordChars =  word.toCharArray();

        for (char c: wordChars){
            printList(transformIntToChar(c));
        }
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }
}
