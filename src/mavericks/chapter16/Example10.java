package mavericks.chapter16;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example10 {
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
        queue.poll();

        System.out.println(queue.peek());
    }
}
