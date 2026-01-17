package abstract_factory;

public class Main {
    public static void main(String[] args) {

        UIFactory factory = new BFactory();

        Button button = factory.createButton("Click me!");
        button.display();
        button.setText("Don't click me please!");
        button.display();

        TextField textfield = factory.createTextField("Hey!");
        textfield.display();
        textfield.setText("Goodbye!");
        textfield.display();

        Checkbox checkbox = factory.createCheckbox("Check this!");
        checkbox.display();
        checkbox.setText("Don't Check this!");
        checkbox.display();


    }
}
