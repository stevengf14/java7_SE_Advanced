package ec.com.learning.java7.file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("src\\main\\java\\ec\\com\\learning\\java7\\file\\file.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("exists: " + file.exists());
        System.out.println("isHidden: " + file.isHidden());

        File file1 = new File("src\\main\\java\\ec\\com\\learning\\java7\\file");
        File file2 = new File("src\\main\\java\\ec\\com\\learning\\java7\\file", "file2.txt");
        file2.createNewFile();
        File file3 = new File(file1, "file3.txt");
        file3.createNewFile();
    }

}
