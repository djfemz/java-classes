package mavericks.chapter15.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Paths
//windows==> C:\DELL\Desktop\
//unix==> /home/usr/...
public class Example0 {
    //TODO: java.io and java.nio
    public static void main(String[] args) {
        try {
            //step 1
            Path path = Paths.get("C:\\Users\\semicolon\\Documents\\java_workspace\\java_classes\\src\\mavericks\\chapter15\\files\\Person.java");
            //step 2
            Files.createFile(path);
            System.out.println("file created successfully");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
