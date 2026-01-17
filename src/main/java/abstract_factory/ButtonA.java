package abstract_factory;

public class ButtonA implements Button{

    String text;

    public ButtonA(String text){
        this.text = text;
    }

    @Override
    public void display() {
        String button = "[ %s ]".formatted(text);
        System.out.println(button);
    }
}
