package abstract_factory;

public abstract class TextField {
    protected String text;

    abstract void display();

    void setText(String text){
        this.text = text;
    };
}
