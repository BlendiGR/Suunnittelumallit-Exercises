package composite;

public class Employee implements Component {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void toXml(int index) {
        String emptySpace = "  ".repeat(index);
        System.out.println(emptySpace + "<Employee name=\"" + name + "\"/>");
    }

    @Override
    public void add(Component child) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(Component child) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

}
