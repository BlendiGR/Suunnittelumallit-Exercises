package observer;

public class WeatherObserver implements Observer {

    private String name;

    public WeatherObserver (String name) {
        this.name = name;
    }

    @Override
    public void update(double value) {
        System.out.println("OBSERVER : " + name + ": <" + value + ">");
    }

    public String getName() {
        return this.name;
    }
}
