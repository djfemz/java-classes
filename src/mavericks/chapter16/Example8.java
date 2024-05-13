package mavericks.chapter16;

import mavericks.chapter15.json.serialization.Person;
import mavericks.chapter15.json.serialization.Sex;

import java.time.LocalDate;
import java.util.*;

import static java.time.LocalTime.now;

public class Example8 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
            Random random = new Random();
        for (int count = 0; count < 20000000; count++) {
            numbers.add(random.nextInt());
        }

        //23219000
        //20500
        var start = System.nanoTime();
        numbers.add(0, 50);
        var end = System.nanoTime();
        System.out.println(end - start);
    }
}
