package homework2;

public class PrintDivisibleNumbers {

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
