package homework2;

public class RandomValuesInArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }

        for (int value: array){
            System.out.println(value);
        }
    }
}
