package observer;

public class Main {
    public static void main(String[] args) {
        Observable observable = new WeatherStation("Foreca");

        Observer observerOne = new WeatherObserver("Blendi");
        Observer observerTwo = new WeatherObserver("Matti");
        Observer observerThree = new WeatherObserver("Aleksi");

        observable.addSubscriber(observerOne);
        observable.addSubscriber(observerTwo);
        observable.addSubscriber(observerThree);

        Thread thread = new Thread(observable);
        thread.start();

        try {
            Thread.sleep(5000);
            observable.removeSubscriber(observerTwo);
            System.out.println("Removing " + observerTwo.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
