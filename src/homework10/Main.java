package homework10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Path songFile = Paths.get("src/homework10/song");
        try {
            String read = Files.readString(songFile).toLowerCase();
            Map<String, Integer> songWords = new HashMap();

            String[] words = read.split("\\W+");
            for (String word : words) {
                songWords.put(word, songWords.getOrDefault(word, 0) + 1);
            }
            songWords.forEach((key, value) -> System.out.println(key + " : " + value)); //print all words and number in text

            int maxValue = Collections.max(songWords.values());
            String maxKey = "";

            for (Map.Entry<String, Integer> entry : songWords.entrySet()) {  // Iterate through hashmap
                if (entry.getValue() == maxValue) {
                    maxKey = entry.getKey();     // this is the key which has the max value
                }
            }
            System.out.println("The most frequent word in the text is \"" + maxKey + "\" : " + maxValue);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Path " + songFile + " not exists");
        }
    }
}

