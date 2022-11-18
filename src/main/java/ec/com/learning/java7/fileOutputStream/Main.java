package ec.com.learning.java7.fileOutputStream;

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
        long init = System.currentTimeMillis();
        // String text = "Java 7 advanced";
        InputStream origin = null;
        byte[] buffer = new byte[2014];
        try (OutputStream destiny = new FileOutputStream("src\\main\\java\\ec\\com\\learning\\java7\\fileOutputStream\\newFile.txt")) {
            origin = new FileInputStream("src\\main\\java\\ec\\com\\learning\\java7\\fileOutputStream\\file.txt");
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
        long end = System.currentTimeMillis();
        System.out.println("Time OutputStream: " + (end - init));
    }

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        app.writeWithOutputStream();
    }

}
