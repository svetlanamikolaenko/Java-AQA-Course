package homework3;

import java.util.SplittableRandom;

public class StartsFromThe {
    /*4. Given two strings. Check if they start with "The".
    Task: word1 = "The End", word2="End The";
   */
    public static void main(String[] args) {
        String word1 = "The End";
        String word2 = "End The";

        String[] result1 = word1.split(" ");
        String[] result2 = word2.split(" ");

        if (result1[0].compareTo("The") == 0){
            System.out.println(word1 + " stars from \"The\"");
        }

        //OR
        System.out.println( word1 + " starts from The - > " + result1[0].matches("The"));
        System.out.println( word2 + " starts from The - > " + result2[0].matches("The"));

        word1.split(", ").toString().startsWith("The");

        //OR
        System.out.println(checkStartWithThe(word1));
        System.out.println(checkStartWithThe(word2));
    }

    public static String checkStartWithThe(String words){
        String [] strings =  words.split(" ");
        if(strings[0].startsWith("The")){
            return "Text starts with \"The\"";
        }
        return "Text starts from \"" + strings[0] + "\"";
    }
}
