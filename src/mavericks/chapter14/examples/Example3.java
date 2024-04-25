package mavericks.chapter14.examples;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example3 {
    private static Set<String> phonebook = new TreeSet<>();
    public static void main(String[] args) {
        phonebook.add("Zebrudiah");
        phonebook.add("Izu");
        phonebook.add("Femi");
        phonebook.add("Ayomide");
        phonebook.add("Aramide");
        phonebook.add("Johnson");

        System.out.println(searchPhonebook("i"));

    }

    private static String searchPhonebook(String key){
        return phonebook.stream()
                        .filter(n->n.contains(key))
                        .collect(Collectors.joining(","));
    }
}
