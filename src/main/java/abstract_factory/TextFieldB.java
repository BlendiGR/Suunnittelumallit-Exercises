package abstract_factory;

public class TextFieldB implements TextField {

    String text;

    public TextFieldB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String textfield = """
                ╭─────────────────╮
                │ %-15s │
                ╰─────────────────╯""".formatted(text);
        System.out.println(textfield);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

}