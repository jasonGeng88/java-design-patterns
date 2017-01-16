package behavioural.command;

import behavioural.command.command.Command;

/**
 * Created by jason-geng on 1/16/17.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
