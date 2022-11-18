package ec.com.learning.java7.bufferedOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public void writeWithOutputStream() throws IOException {
        // byte - byte
        long init = System.nanoTime();
        // String text = "Java 7 advanced";
        InputStream origin = null;
        byte[] buffer = new byte[2014];
        try (OutputStream destiny = new FileOutputStream("src\\main\\java\\ec\\com\\learning\\java7\\bufferedOutputStream\\newFile.gif")) {
            origin = new FileInputStream("src\\main\\java\\ec\\com\\learning\\java7\\bufferedOutputStream\\file.gif");
            int byteRead;
            while ((byteRead = origin.read(buffer)) != -1) {
                destiny.write(buffer, 0, byteRead);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (origin != null) {
                origin.close();
            }

        }
        long end = System.nanoTime();
        System.out.println("Time OutputStream: " + (end - init));
    }

    public void readWithBufferedOutputStream() throws IOException {
        long init = System.nanoTime();
        final int BUFFER_SIZE = 1024 * 8;
        byte[] buffer = new byte[BUFFER_SIZE];
        InputStream origin = null;
        try (OutputStream destiny = new BufferedOutputStream(new FileOutputStream("src\\main\\java\\ec\\com\\learning\\java7\\bufferedOutputStream\\file.gif"), BUFFER_SIZE)) {
            int byteRead;
            while ((byteRead = origin.read(buffer)) != -1) {
                destiny.write(byteRead);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (origin != null) {
                origin.close();
            }
        }
        long end = System.nanoTime();
        System.out.println("Time BufferedOutputStream " + (end - init));
    }

    public static void main(String[] args) throws IOException {
        Main app = new Main();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    app.writeWithOutputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try {
                    app.readWithBufferedOutputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(r1);
        thread1.start();

        Thread thread2 = new Thread(r2);
        thread2.start();
    }

}
