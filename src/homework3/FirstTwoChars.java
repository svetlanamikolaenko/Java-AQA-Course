package homework3;

public class FirstTwoChars {
    /*2. Given a string. Write a code that will create a new string made of the first two characters of the initial string.
    If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

    For example:
    "AE_1381" -> "AE"
    "A" -> "A"
    "" -> ""
    */
    public static void main(String[] args) {
        String first = "AE_1381";
        String any = "Hi";
        String a = "A";
        String empty = "";
        System.out.println(newString(first));
        System.out.println(newString(any));
        System.out.println(newString(a));
        System.out.println(newString(empty));

    }
    public static String newString(String str){
        if(str.length() >= 2){
            str = str.substring(0,2);
        }
        return "\"" +str + "\"";
    }
}
