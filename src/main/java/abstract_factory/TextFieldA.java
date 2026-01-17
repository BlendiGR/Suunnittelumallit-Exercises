package abstract_factory;

public class TextFieldA implements TextField{

    String text;

    public TextFieldA(String text){
        this.text = text;
    }

    @Override
    public void display() {
        String textField = "| %-15s |".formatted(text);
        System.out.println(text);
    }
}
