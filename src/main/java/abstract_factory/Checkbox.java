package abstract_factory;

public abstract class Checkbox {
    protected String text;

    abstract void display();

    void setText(String text){
        this.text = text;
    };
}
