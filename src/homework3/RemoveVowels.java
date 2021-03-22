package homework3;

import java.util.Locale;

public class RemoveVowels {
    /*
    5. Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.
     */
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";
        String srt1 = str.toLowerCase().replaceAll("[aeiou]", "");
        System.out.println(srt1);
    }
}
