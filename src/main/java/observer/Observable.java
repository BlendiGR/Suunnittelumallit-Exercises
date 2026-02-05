package observer;


import java.util.HashSet;
import java.util.Set;

public abstract class Observable implements Runnable {

    Set<Observer> observers = new HashSet<>();

    public abstract void notifySubscribers();

    public void addSubscriber(Observer obs) {
        observers.add(obs);
    }

    public void removeSubscriber(Observer obs) {
        observers.remove(obs);
    }


}
