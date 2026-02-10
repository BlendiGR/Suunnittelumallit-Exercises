package singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.changeFile("test_1");
        logger.write("testtesttesttest");
        logger.write("Morjesta!");

        logger.changeFile("test_2");
        logger.write("testtesttesttest");
        logger.write("Morjesta!");
        logger.write("Moro");
    }
}
