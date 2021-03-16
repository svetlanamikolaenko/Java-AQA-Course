package homework2;

import java.util.Arrays;

public class SqureRootArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        double[] resultArray = new double[10];

        for (int i = 0; i < array.length;) {
            for (int j = 0; j < resultArray.length; j++){
                array[i] = (int) Math.round(Math.random() * 100);
                resultArray[j] = Math.round(Math.sqrt(array[i])*100.0)/100.00;
                i++;
            }
        }
        System.out.println("Values in array: " + Arrays.toString(array));
        System.out.println("Values in result array: " + Arrays.toString(resultArray));
    }
}
