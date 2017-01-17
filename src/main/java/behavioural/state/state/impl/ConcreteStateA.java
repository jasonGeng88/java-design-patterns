package behavioural.state.state.impl;

import behavioural.state.state.State;

/**
 * Created by jason-geng on 1/17/17.
 */
public class ConcreteStateA implements State {

    public State execute() {
        System.out.println("it's a state A");
        return new ConcreteStateB();
    }

}
