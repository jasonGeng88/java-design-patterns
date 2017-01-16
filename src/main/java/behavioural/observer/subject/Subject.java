package behavioural.observer.subject;

import behavioural.observer.observer.Observer;

/**
 * Created by jason-geng on 1/16/17.
 */
public interface Subject {

    void register(Observer observer);

    void deregister(Observer observer);

    void notifyObservers();
}
