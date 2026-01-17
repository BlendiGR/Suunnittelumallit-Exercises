package abstract_factory;

public class ButtonB implements Button{

    String text;

    public ButtonB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String button = """
                ┌──────────┐
                │  %-6s  │
                └──────────┘""".formatted(text);
        System.out.println(button);
    }

}
