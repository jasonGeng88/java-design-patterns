package behavioural.state;

import behavioural.state.state.State;

/**
 * Created by jason-geng on 1/17/17.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request(){
        State s =state.execute();
        this.state = s;
    }
}
