package ec.com.learning.java7.completionService;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);
        Future<String> task1 = completionService.submit(new CThread(3000));
        Future<String> task2 = completionService.submit(new CThread(2000));

        /*while (!task1.isDone() && !task2.isDone()) {

        }*/
        while (true) {
            System.out.println(completionService.take().get());
        }
    }

}
