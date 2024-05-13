package mavericks.chapter15.streams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.System.out;

public class Example10 {
    public static void main(String[] args)  {
        String location = "C:\\Users\\semicolon\\Desktop\\java-classes\\src\\mavericks\\chapter15\\streams\\sample3.txt";
        Path path = Paths.get(location);
        try {
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("Happy Married Life, Bolaji");
            writer.close();
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
    
}
