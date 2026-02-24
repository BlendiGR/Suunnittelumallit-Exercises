package decorator;

public class Main {
    public static void main(String[] args) throws Exception {

        Printer printer;
        printer = new BasicPrinter();


        printer.print("hey");

        printer = new EncryptedPrinter(new BasicPrinter(), "1234567891011121");
        printer.print("MOI");

        printer = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()), "1234567812345678");
        printer.print("MOI MOI MOI MOI MOI MOI");

    }
}
