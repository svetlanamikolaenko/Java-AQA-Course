package homework3;

public class LongInsideShort {
    /*6. Given 2 strings, a and b. Create a string c of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
    Task: a = "hop", b = "hello"
   */
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        String c;

        if(a.length() < b.length()){
            c = a + b + a;
            System.out.println(c);
        } else if (b.length() < a.length()){
            c = b + a + b;
            System.out.println(c);
        }
        else {
            System.out.println(a + " length more than or equals to " + b + " length");
        }
    }
}
