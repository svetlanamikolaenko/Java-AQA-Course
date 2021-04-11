package homework9;
/*
1. Read about java.nio package(Path, Paths, Files, File) and try to use it to read the data from the first file
and write this data to the second file. Delete the initial file from the disk.
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class CopyFile {
    public static void main(String[] args) {
        File file = new File("src/homework9/original.txt");
        Path original = file.toPath();
        Path copyOfOriginal = Paths.get("src/homework9/copy_of_original.txt");

        try {
            Files.copy(original, copyOfOriginal, StandardCopyOption.COPY_ATTRIBUTES);
            Files.delete(original);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("File " + file.getName() + " not exists");
        }
    }
}
