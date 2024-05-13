package mavericks.chapter16;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Example9 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a,b)->{
             return b-a;

        };
        Queue<Integer> queue = new PriorityQueue<>(comparator);
        queue.offer(40);
        queue.offer(10);
        queue.offer(60);
        queue.offer(20);
        queue.offer(50);
        queue.offer(30);


        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
