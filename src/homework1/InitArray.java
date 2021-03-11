package homework1;

import java.util.Arrays;

public class InitArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++ ){
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Array length is: " + array.length);
    }
}
