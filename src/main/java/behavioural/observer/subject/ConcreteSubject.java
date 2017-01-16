package behavioural.observer.subject;

import behavioural.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason-geng on 1/16/17.
 */
public class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();

    public void register(Observer observer){
        observers.add(observer);
    }


    public void deregister(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
