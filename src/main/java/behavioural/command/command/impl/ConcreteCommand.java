package behavioural.command.command.impl;

import behavioural.command.Receiver;
import behavioural.command.command.Command;

/**
 * Created by jason-geng on 1/16/17.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }

}
