package ec.com.learning.java7.threadRunnable;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class TThread extends Thread {

    private int id;

    public TThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("[T]Executing thread id: " + id);
        }
    }
    
}
