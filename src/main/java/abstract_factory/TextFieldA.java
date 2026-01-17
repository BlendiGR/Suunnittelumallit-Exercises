package abstract_factory;

public class TextFieldA extends TextField{
    public TextFieldA(String text){
        this.text = text;
    }

    @Override
    public void display() {
        String textField = "| %-15s |".formatted(text);
        System.out.println(text);
    }
}
