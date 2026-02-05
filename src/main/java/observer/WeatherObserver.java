package observer;

public class WeatherObserver implements Observer {

    String name;

    public WeatherObserver (String name) {
        this.name = name;
    }

    @Override
    public void update(double value) {
        System.out.println(name + ": " + value);
    }
}
