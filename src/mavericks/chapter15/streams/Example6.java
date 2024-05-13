package mavericks.chapter15.streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\semicolon\\Desktop\\java-classes\\src\\mavericks\\chapter15\\streams\\sample.txt";
        try(FileWriter fileWriter = new FileWriter(fileLocation)){
            fileWriter.write("Hello World");
        }catch (IOException exception){
            System.err.println("ERROR: "+ exception.getMessage());
        }

    }

}
