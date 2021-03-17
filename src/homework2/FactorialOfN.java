package homework2;

public class FactorialOfN {
    public static void main(String[] args) {
        int n;

        do{
            n = (int) Math.round(Math.random() * 10);
        } while (n == 0 );

        int factorial = n;
        if (n != 1){
            for (int i = 1; i < n; i++){
                factorial = factorial * (n-i);
            }
        }
        System.out.println("Factorial of  " + n + "!" + " : " + factorial);
    }
}
