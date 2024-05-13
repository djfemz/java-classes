package mavericks.chapter15.streams;

import java.io.*;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\semicolon\\Desktop\\java-classes\\src\\mavericks\\chapter15\\streams\\sample.txt";
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader reader = new BufferedReader(inputStreamReader)){
            String data = reader.lines().collect(Collectors.joining("\n"));
            System.out.println(data);
        }catch (IOException exception){
            System.err.println("ERROR: "+ exception.getMessage());
        }

    }
    
}
