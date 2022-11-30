package ec.com.learning.java7.synchronized_;

import ec.com.learning.java7.threads.TThread;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) {
        // CountryDAOImpl dao = new CountryDAOImpl();
        // With correct singleton

        Runnable r = new Runnable() {
            @Override
            public void run() {
                CountryDAOImpl dao = CountryDAOImpl.getInstance();
                for (Object obj : dao.getCountries()) {
                    System.out.println(((Country) obj).getName());
                }
            }
        };

        Thread thread1 = new Thread(r);
        thread1.start();

        Thread thread2 = new Thread(r);
        thread2.start();
    }

}
