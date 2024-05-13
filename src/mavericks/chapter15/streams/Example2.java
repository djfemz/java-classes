package mavericks.chapter15.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Example2 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\semicolon\\Desktop\\java-classes\\src\\mavericks\\chapter15\\streams\\sample.txt";
        try(FileOutputStream outputStream = new FileOutputStream(fileLocation, true);
                PrintStream printStream = new PrintStream(outputStream)) {
            System.setOut(printStream);
            System.out.println("Hello World");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
