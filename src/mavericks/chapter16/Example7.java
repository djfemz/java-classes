package mavericks.chapter16;

import mavericks.chapter15.json.serialization.Person;
import mavericks.chapter15.json.serialization.Sex;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Example7 {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>(new PersonComparator());
        people.add(new Person("Buhari", LocalDate.of(2000, 12, 11), "", Sex.SHIM));
        people.add(new Person("Wike", LocalDate.of(1995, 2, 11), "", Sex.SHIM));
        people.add(new Person("Dayo", LocalDate.of(2012, 4, 12), "", Sex.FEMALE));
        people.add(new Person("Bayo", LocalDate.of(2012, 4, 14), "", Sex.FEMALE));
        people.add(new Person("Bolaji", LocalDate.of(1995, 3, 11), "", Sex.MALE));

        System.out.println(people);
    }
}
