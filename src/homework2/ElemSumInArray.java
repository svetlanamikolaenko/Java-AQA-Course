package homework2;

import java.util.Arrays;

public class ElemSumInArray {
    /*
    Create an array of 10 integers.
    Calculate and print the sum of all its elements except the first one and the last one.
    */
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }
        System.out.println("Sum of elements in array: " + sum);
    }
}
