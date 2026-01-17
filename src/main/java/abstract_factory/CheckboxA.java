package abstract_factory;

public class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String checkbox = "[X] %s".formatted(text);
        System.out.println(checkbox);
    }
}