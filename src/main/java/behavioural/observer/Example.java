package behavioural.observer;

import behavioural.observer.observer.Observer;
import behavioural.observer.observer.impl.ConcreteObserver1;
import behavioural.observer.observer.impl.ConcreteObserver2;
import behavioural.observer.subject.ConcreteSubject;
import behavioural.observer.subject.Subject;

/**
 * 观察者模式（发布-订阅）
 * 当观察目标的状态发生改变时,以通知的方式,来通知相应的观察者来进行相应处理
 * 将观察目标与观察者进行解耦,增强系统的扩展性
 *
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.register(observer1);
        subject.register(observer2);

        subject.notifyObservers();

        subject.deregister(observer1);
        subject.notifyObservers();
    }
}
