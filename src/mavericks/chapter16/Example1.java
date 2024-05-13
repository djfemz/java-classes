package mavericks.chapter16;

import mavericks.chapter15.json.serialization.Person;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        /**
         * Boolean --> boolean
         * Byte ---> byte
         * Short -->short
         * Character -->char
         * Integer --> int
         * Long --> long
         * Float --> float
         * Double -->double
         */

        Collection<String> words = new TreeSet<>();
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");
        words.add("Happy");

        System.out.println(words);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(4);
        numbers2.add(4);
        numbers2.add(8);
        numbers2.add(5);
        Set<List<Integer>> set = new HashSet<>();

        set.add(numbers);
        set.add(numbers2);

        System.out.println(set);
    }
}
