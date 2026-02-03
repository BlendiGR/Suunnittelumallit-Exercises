package composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements Component {

    private String name;
    private List<Component> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (Component child : children) {
            total += child.getSalary();
        }
        return total;
    }

    @Override
    public void toXml(int index) {
        String emptySpace = "  ".repeat(index);
        System.out.println(emptySpace + "<Department name=\"" + name + "\">");

        for (Component child : children) {
            child.toXml(index + 1);
        }

        System.out.println(emptySpace + "</Department>");
    }

    @Override
    public void add(Component child) {
        children.add(child);
    }

    @Override
    public void remove(Component child) {
        children.remove(child);
    }
}
