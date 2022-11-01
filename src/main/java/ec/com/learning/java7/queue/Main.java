package ec.com.learning.java7.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*Queue<String> queue = new PriorityQueue<>();
        queue.offer("1-Steven");
        queue.offer("2-Andres");
        queue.offer("3-German");
        queue.offer("4-Gregorio");

        // queue.forEach(x -> System.out.println(x));
        
        while(!queue.isEmpty()){
            System.out.println("We're going to assist: " + queue.peek());
            System.out.println("Assisting to " + queue.poll());
            Thread.sleep(500);
        }*/

        Queue<Person> queue = new PriorityQueue<>();
        queue.offer(new Person(3, "German", 12));
        queue.offer(new Person(4, "Gregorio", 13));
        queue.offer(new Person(1, "Steven", 10));
        queue.offer(new Person(2, "Andres", 11));
        
        // queue.forEach(x -> System.out.println(x));
        while (!queue.isEmpty()) {
            // System.out.println("We're going to assist: " + queue.peek());
            System.out.println("Assisting to " + queue.poll());
            Thread.sleep(500);
        }
    }

}
