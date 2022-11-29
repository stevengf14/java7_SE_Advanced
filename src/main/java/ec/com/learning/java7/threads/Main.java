package ec.com.learning.java7.threads;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        TThread thread1 = new TThread(1);
        thread1.start();
        //thread1.join();

        Thread thread2 = new Thread(new RThread(2));
        //thread2.sleep(3000);
        //Thread.sleep(3000);
        thread2.start();
        //thread2.join();

        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("[A]Executing thread");
            }

        };
        Thread thread3 = new Thread(r);
        thread3.start();
        //thread3.join();
        if (thread3.isAlive()) {
            thread3.start();
        }

        System.out.println("[M]Executing thread MAIN");
    }

}
