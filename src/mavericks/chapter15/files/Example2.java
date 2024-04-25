package mavericks.chapter15.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Paths
//windows==> C:\DELL\Desktop\
//unix==> /home/usr/...
public class Example2 {
    //TODO: java.io and java.nio
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\semicolon\\Documents\\");
        try (DirectoryStream<Path> directoryStream =
                     Files.newDirectoryStream(path)){
            directoryStream.forEach(System.out::println);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
