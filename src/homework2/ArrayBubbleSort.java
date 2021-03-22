package homework2;

import java.util.Arrays;

public class ArrayBubbleSort {
    /* Create an array of any length and fill it with random integers.
    Using loops and conditions sort this array and print it out to the console.
     You can use any sorting algorithm you want. Do not use build-in methods to sort the array.
     */
    public static void main(String[] args) {
    int[] array = new int[10];
    for (int i = 0; i<array.length; i++){
        array[i] = (int) Math.round(Math.random() * 100);
    }
        System.out.println("Unsorted Array: " + Arrays.toString(array));

    for (int i = 0; i<array.length; i++){
        for (int j = 0; j < array.length-1; j++)
            if(array[j] > array[j+1] ){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
    }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
