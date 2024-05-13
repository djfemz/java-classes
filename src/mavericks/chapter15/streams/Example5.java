package mavericks.chapter15.streams;

import java.io.FileReader;
import java.io.IOException;

public class Example5 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\semicolon\\Desktop\\java-classes\\src\\mavericks\\chapter15\\streams\\sample.txt";
        char[] fileChars = new char[1024];
        try(FileReader fileReader = new FileReader(fileLocation)){
            int numberOfCharactersRead = fileReader.read(fileChars);
            displayFileContent(numberOfCharactersRead, fileChars);
        }catch (IOException exception){
            System.err.println("ERROR: "+ exception.getMessage());
        }

    }

    private static void displayFileContent(int numberOfCharactersRead, char[] fileChars) {
        for (int counter = 0; counter < numberOfCharactersRead; counter++) {
            System.out.print(fileChars[counter]);
        }
    }
}
