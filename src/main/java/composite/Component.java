package composite;

public interface Component {
    String getName();
    double getSalary();
    void toXml(int index);
    void add(Component child);
    void remove(Component child);

}
