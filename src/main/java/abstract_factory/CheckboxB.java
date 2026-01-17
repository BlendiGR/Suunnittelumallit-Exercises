package abstract_factory;

public class CheckboxB implements Checkbox {

    String text;

    public CheckboxB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String checkbox = "☒ %s".formatted(text);
        System.out.println(checkbox);
    }

}