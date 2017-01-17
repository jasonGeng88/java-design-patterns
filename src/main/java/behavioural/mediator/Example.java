package behavioural.mediator;

import behavioural.mediator.colleague.Colleague;
import behavioural.mediator.colleague.impl.ConcreteColleagueA;
import behavioural.mediator.colleague.impl.ConcreteColleagueB;
import behavioural.mediator.mediator.Mediator;
import behavioural.mediator.mediator.impl.ConcreteMediator;

/**
 * 中介者模式
 * 将原本两个强耦合的对象,通过一个中间对象来关联,达到对象之间的解耦
 * 劣势:中间对象可能会变得尤为复杂,维护成本高
 * Created by jason-geng on 1/17/17.
 */
public class Example {

    private final static int CA = 1;
    private final static int CB = 2;

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague ca = new ConcreteColleagueA();
        Colleague cb = new ConcreteColleagueB();
        mediator.register(CA, ca);
        mediator.register(CB, cb);

        ca.sendMsg(CB, mediator);
        cb.sendMsg(CA, mediator);
    }

}
