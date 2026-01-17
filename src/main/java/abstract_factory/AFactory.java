package abstract_factory;

public class AFactory implements UIFactory {

    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxA(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text) ;
    }
}
