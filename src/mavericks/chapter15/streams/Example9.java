package mavericks.chapter15.streams;

import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Example9 {
    public static void main(String[] args) {
        try(OutputStreamWriter writer = new OutputStreamWriter(out);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            String data = "Hello guy's, it's break time and only 16 people are gonna eat.";
            bufferedWriter.write(data);
        }catch (IOException exception){
            System.err.println("ERROR: "+ exception.getMessage());
        }
    }
    
}
