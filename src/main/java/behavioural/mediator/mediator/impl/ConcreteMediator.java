package behavioural.mediator.mediator.impl;

import behavioural.mediator.colleague.Colleague;
import behavioural.mediator.mediator.Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason-geng on 1/17/17.
 */
public class ConcreteMediator implements Mediator {

    private Map<Integer, Colleague> map =  new HashMap<Integer, Colleague>();

    public void register(int value, Colleague colleague) {
        map.put(value, colleague);
    }

    public void operate(int value) {
        map.get(value).receiveMsg();
    }
}
