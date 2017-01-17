package behavioural.command;

import behavioural.command.command.Command;
import behavioural.command.command.impl.ConcreteCommand;

/**
 * 命令模式
 * 调用者与接收者之间通过命令的方式进行通信,
 * 调用者发送的命令中一定要包含接收者的信息（得知道命令是发送给谁的）,至于接收者如何处理,调用放无需关心
 * 优势: 调用者与接收者直接解耦
 * 劣势: 实现复杂,增加调用次数
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.call();
    }

}
