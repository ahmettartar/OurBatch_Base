package day08;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(20);
        queue.add(10);
        queue.add(40);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        //queue.add(null); //NullPointerException
        //queue.get(); get method is from list
        System.out.println(queue);
        // random order
        //duplicates OK
        //NOT accept null

        queue.offer(30);// same as add method
        queue.add(15);
        System.out.println(queue);

        //System.out.println(new PriorityQueue<>().remove());  //causes exception (NoSuchElementException)
        // because there is no elements

        //System.out.println(queue.remove(665));

        System.out.println(new PriorityQueue<>().poll());//  gives null
        //System.out.println(new PriorityQueue<>().poll());//  return null
    }
}
