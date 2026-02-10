package singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.write("hey ");
        logger.write("Morjens");
        logger.close();

        logger.setFileName("testi1.txt");
        logger.write("terve");
        logger.close();
    }
}
