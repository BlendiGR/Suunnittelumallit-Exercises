package composite;

public class Main {
    public static void main(String[] args){
        Department organization = new Department("Best Company");
        Employee ceo = new Employee("Bossman", 25000);

        Department mainOffice = new Department("Headquarters");
        Department humanResources = new Department("HR");
        Department engineering = new Department("Engineering");

        Department electrical = new Department("Electrical");
        Department software = new Department("Software");

        Employee hrLead = new Employee("Sara", 6000);
        Employee electricalEngineer1 = new Employee("Artan", 4800);
        Employee electricalEngineer2 = new Employee("Mira", 4900);
        Employee softwareEngineer1 = new Employee("Blendi", 5000);
        Employee softwareEngineer2 = new Employee("Joni", 4650);
        Employee softwareEngineer3 = new Employee("Linda", 5200);

        organization.add(ceo);
        organization.add(mainOffice);

        mainOffice.add(humanResources);
        mainOffice.add(engineering);

        humanResources.add(hrLead);

        engineering.add(electrical);
        electrical.add(software);

        electrical.add(electricalEngineer1);
        electrical.add(electricalEngineer2);

        software.add(softwareEngineer1);
        software.add(softwareEngineer2);
        software.add(softwareEngineer3);

        organization.toXml(0);

        System.out.println("Software Department salary : " + software.getSalary());

        System.out.println("Company salary : " + organization.getSalary());

        System.out.println("Blendi's salary : " + softwareEngineer1.getSalary());


    }
}