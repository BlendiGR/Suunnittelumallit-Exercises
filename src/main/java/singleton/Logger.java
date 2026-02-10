package singleton;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private File file;

    private Logger() {
        this.file = new File("default.txt");
    }

    public static synchronized Logger getInstance(){
        if (instance == null) {
            return instance = new Logger();
        }
        return instance;
    }

    public void write(String text){
        try ( FileWriter writer = new FileWriter(file, true);) {
            writer.write("\n" + text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeFile(String path) {
        this.file = new File(path);
    }
}
