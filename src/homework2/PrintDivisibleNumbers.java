package homework2;

public class PrintDivisibleNumbers {
    //Print all the numbers from 1 to 100 that are divisible by 3 or divisible by 5, but not divisible by 2.
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
            if((array[i]%3 == 0 || array[i]%5 == 0) && array[i]%2 != 0){
                System.out.println(array[i]);
            }
        }
    }
}
