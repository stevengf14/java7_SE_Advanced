package ec.com.learning.java7.deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("1-Steven");
        deque.add("2-Andres");
        deque.add("3-German");
        deque.add("4-Gregorio");
        // deque.add(null);

        String x = deque.peek();
        System.out.println("Peek " + x);

        x = deque.poll();
        System.out.println("Poll " + x);

        deque.addFirst("0-Mitocode");
        deque.addLast("5-MitocodeFinal");

        deque.forEach(element -> {
            System.out.println(element);
        });
    }

}
