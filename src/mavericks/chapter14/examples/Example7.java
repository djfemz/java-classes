package mavericks.chapter14.examples;

public class Example7 {
    public static void main(String[] args) {
        String s1 = "Hello World";

        String s2 = "world";

        System.out.println(s1.regionMatches( true, 6, s2, 0, 5));
    }


}
