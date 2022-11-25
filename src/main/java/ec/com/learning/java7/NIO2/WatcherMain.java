package ec.com.learning.java7.NIO2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

/**
 *
 * @author Steven Guamán - November 2022
 */
public class WatcherMain {

    public void watch() throws Exception {
        WatchService watcher = FileSystems.getDefault().newWatchService();
        Path dir = Paths.get("src\\main\\java\\ec\\com\\learning\\java7\\NIO2\\");

        dir.register(watcher, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
        System.out.println("Initializing watcher for " + dir.getFileName());

        while (true) {
            WatchKey key;
            key = watcher.take();
            List<WatchEvent<?>> eventsList = key.pollEvents();
            for (WatchEvent<?> event : eventsList) {
                // Getting event type
                WatchEvent.Kind<?> eventType = event.kind();

                // Getting file name
                Path fileName = (Path) event.context();

                // System.out.println(eventType.name() + ": " + fileName);
                if (eventType == OVERFLOW) {
                    continue;
                } else if (eventType == ENTRY_CREATE) {

                } else if (eventType == ENTRY_MODIFY) {

                } else if (eventType == ENTRY_DELETE) {
                    if (fileName.toString().equalsIgnoreCase("file_1.txt")) {
                        System.out.println("[IMPORTANT] The file file_1.txt was deleted");
                    }
                }
            }

            // IMPORTANT
            if (!key.reset()) {
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        WatcherMain app = new WatcherMain();
        app.watch();
    }

}
