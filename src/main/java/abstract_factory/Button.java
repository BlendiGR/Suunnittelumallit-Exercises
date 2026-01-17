package abstract_factory;

public abstract class Button {
    protected String text;

    abstract void display();

    void setText(String text){
        this.text = text;
    };
}
