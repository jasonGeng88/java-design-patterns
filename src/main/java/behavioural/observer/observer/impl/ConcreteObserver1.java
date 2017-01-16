package behavioural.observer.observer.impl;

import behavioural.observer.observer.Observer;

/**
 * Created by jason-geng on 1/16/17.
 */
public class ConcreteObserver1 implements Observer {

    public void update() {
        System.out.println("it's a ConcreteObserver1");
    }

}
