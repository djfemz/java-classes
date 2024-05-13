package mavericks.chapter15.streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\semicolon\\Desktop\\java-classes\\src\\mavericks\\chapter15\\streams\\sample.txt";
        try(var inputStream = new FileInputStream(fileLocation);
            var dataInputStream = new DataInputStream(inputStream)){
            byte[] fileData = dataInputStream.readAllBytes();
            System.out.println(new String(fileData));
        }catch (IOException exception){
            exception.printStackTrace();
            System.err.println("Error: "+ exception.getMessage());
        }
    }
}
