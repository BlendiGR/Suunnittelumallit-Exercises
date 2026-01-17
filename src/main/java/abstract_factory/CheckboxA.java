package abstract_factory;

public class CheckboxA implements Checkbox {
    String text;

    public CheckboxA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String checkbox = "[X] %s".formatted(text);
        System.out.println(checkbox);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}