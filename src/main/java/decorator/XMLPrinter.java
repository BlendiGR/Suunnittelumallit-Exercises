package decorator;

public class XMLPrinter extends PrinterDecorator {

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) throws Exception {
        super.print("<message>" + message + "</message>");
    }
}
