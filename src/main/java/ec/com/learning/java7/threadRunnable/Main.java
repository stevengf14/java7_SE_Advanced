package ec.com.learning.java7.threadRunnable;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) {

        TThread thread1 = new TThread(1);
        thread1.start();

        Thread thread2 = new Thread(new RThread(2));
        thread2.start();

        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("[A]Executing thread");
                }
            }

        };
        Thread thread3 = new Thread(r);
        thread3.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("[M]Executing thread MAIN " + i);
        }
    }

}
