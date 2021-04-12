package homework9;
/*
1. Read about java.nio package(Path, Paths, Files, File) and try to use it to read the data from the first file
and write this data to the second file. Delete the initial file from the disk.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CopyFile {
    public static void main(String[] args) {
        Path original = Paths.get("src/homework9/original.txt");
        Path copyOfOriginal = Paths.get("src/homework9/copy_of_original.txt");

        try {
            String read = Files.readString(original);
            Files.writeString(copyOfOriginal, read);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Path " + original + " not exists");
        }
    }
}
