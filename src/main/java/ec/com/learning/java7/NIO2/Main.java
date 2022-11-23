package ec.com.learning.java7.NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class Main {

    public void fileOperations(String operation) throws IOException {
        Path path = Paths.get("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\file.txt");
        Path pathDestiny = Paths.get("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\copyFile.txt");

        switch (operation) {
            case "exists":
                boolean exists = Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
                System.out.println("File exists: " + exists);
                break;
            case "create":
                if (!Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                    Path newPath = Files.createDirectories(path);
                } else {
                    System.out.println("The file already exists");
                }
                break;
            case "copy":
                if (!Files.exists(pathDestiny, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                    Files.copy(path, pathDestiny, StandardCopyOption.REPLACE_EXISTING);
                } else {
                    System.out.println("The file already exists");
                }
                break;
            case "move":
                Files.move(path, pathDestiny, StandardCopyOption.REPLACE_EXISTING);
                break;
            case "delete":
                Files.delete(pathDestiny);
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        //app.fileOperations("exists");
        //app.fileOperations("create");
        //app.fileOperations("copy");
        //app.fileOperations("move");
        app.fileOperations("delete");
    }

}
