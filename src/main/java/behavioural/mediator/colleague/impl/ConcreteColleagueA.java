package behavioural.mediator.colleague.impl;

import behavioural.mediator.colleague.Colleague;
import behavioural.mediator.mediator.Mediator;

/**
 * Created by jason-geng on 1/17/17.
 */
public class ConcreteColleagueA implements Colleague {

    public void sendMsg(int value, Mediator mediator) {
        mediator.operate(value);
    }

    public void receiveMsg() {
        System.out.println("it's a colleague A");
    }


}
