package ec.com.learning.java7.callableFutureExecutorService;

import java.util.concurrent.Callable;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class CThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Callable Thread";
    }

}
