package abstract_factory;

public class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String checkbox = "☒ %s".formatted(text);
        System.out.println(checkbox);
    }

}