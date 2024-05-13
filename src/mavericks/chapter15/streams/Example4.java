package mavericks.chapter15.streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\semicolon\\Desktop\\java-classes\\src\\mavericks\\chapter15\\streams\\sample1.txt";
        try(FileOutputStream fileOutputStream =
                    new FileOutputStream(fileLocation, true)){
            String data = "\nInvest your money wisely, stop playing sporty bet";
            fileOutputStream.write(data.getBytes());
        }catch (IOException exception){
            exception.printStackTrace();
            System.err.println("Error: "+ exception.getMessage());
        }
    }
}
