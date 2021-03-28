package homewok4.task9;
/*
9. Write your own example of the recursive function. You can find a lot of examples on the Internet.
 */

public class Recursion {
    //Print all numbers from 1 to n.
    public static String recursion(int n) {
        if (n == 1) return "1";
        return recursion(n - 1) + " " + n;
    }

    public static void main(String[] args) {
            System.out.println(recursion(16));
        }
    }

