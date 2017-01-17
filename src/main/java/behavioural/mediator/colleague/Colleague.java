package behavioural.mediator.colleague;

import behavioural.mediator.mediator.Mediator;

/**
 * Created by jason-geng on 1/17/17.
 */
public interface Colleague {

    void sendMsg(int value, Mediator mediator);

    void receiveMsg();
}
