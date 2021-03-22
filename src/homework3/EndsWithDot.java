package homework3;

public class EndsWithDot {
    /*9. Given some random string s. Verify if that string ends with ".".
    If so, leave this string as is. If not - add it. Test strings create on your own.
    */
    public static void main(String[] args) {
        String firstRandom = "Hello.";
        String secondRandom = "Hello";
        String thirdRandom = "Do play they miss give so up. Words to up style of since world";

        System.out.println(addDot(firstRandom));
        System.out.println(addDot(secondRandom));
        System.out.println(addDot(thirdRandom));
    }

    public static String addDot(String str){
        if(str.endsWith(".")){
            return str;
        } else {
            StringBuilder sb = new StringBuilder(str);
            return sb.append(".").toString();
        }
    }
}
