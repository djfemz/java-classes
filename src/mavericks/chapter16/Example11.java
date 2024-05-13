package mavericks.chapter16;

import java.util.*;

public class Example11 {
    public static void main(String[] args) {
            Stack<Integer> numbers = new Stack<>();
            numbers.push(4);
            numbers.push(1);
            numbers.push(10);

            System.out.println(numbers);
            numbers.pop();
            System.out.println(numbers);
        System.out.println(numbers.peek());

    }
}
