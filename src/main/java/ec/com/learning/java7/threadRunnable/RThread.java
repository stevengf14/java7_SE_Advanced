package ec.com.learning.java7.threadRunnable;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class RThread implements Runnable{
    
    private int id;

    public RThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("[R]Executing thread id: " + id);
        }
    }
    
}
