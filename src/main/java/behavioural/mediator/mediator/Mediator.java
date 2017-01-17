package behavioural.mediator.mediator;

import behavioural.mediator.colleague.Colleague;

/**
 * Created by jason-geng on 1/17/17.
 */
public interface Mediator {

    void register(int value, Colleague colleague);

    void operate(int value);

}
