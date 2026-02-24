package decorator;

public class PrinterDecorator implements Printer {

    private Printer printer;

    public PrinterDecorator(Printer printer){
        this.printer = printer;
    }

    @Override
    public void print(String message) throws Exception {
        try {
            printer.print(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
