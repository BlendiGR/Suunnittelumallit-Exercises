package observer;

public class WeatherStation extends Observable {

    private String name;
    private double temp;

    public WeatherStation(String name) {
        this.name = name;
        this.temp = -40 + (Math.random() * 80);
    }



    @Override
    public void notifySubscribers() {
        for (Observer obs : observers) {
            obs.update(temp);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (Math.random() > 0.5 && temp < 40) {
                    temp++;
                    notifySubscribers();
                } else if (temp > -40) {
                    temp--;
                    notifySubscribers();
                }
                Thread.sleep(1000 + (int)(Math.random() * 4000));
            } catch (InterruptedException error) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
