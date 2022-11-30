package ec.com.learning.java7.completionService;

import java.util.concurrent.Callable;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class CThread implements Callable<String> {
    
    private int seconds;
    
    public CThread(int seconts) {
        this.seconds = seconds;
    }
    
    @Override
    public String call() throws Exception {
        Thread.sleep(seconds);
        return "Callable Thread";
    }
    
}
