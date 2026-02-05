package observer;

public class WeatherStation extends Observable implements Runnable {

    private String name;
    private double temp;

    public WeatherStation(String name, double initTemp) {
        this.name = name;
        this.temp = initTemp;
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
                Thread.sleep(100);
            } catch (InterruptedException error) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
