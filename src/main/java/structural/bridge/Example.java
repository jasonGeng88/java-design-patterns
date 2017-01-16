package structural.bridge;

import structural.bridge.implementor.Implementor;
import structural.bridge.implementor.impl.ConcreteImplementor1;
import structural.bridge.implementor.impl.ConcreteImplementor2;

/**
 * 桥接模式
 * 将抽象部分与具体实现分离, 符合开闭原则.
 * 有点类似适配器, 但桥接模式往往在设计之初,而适配器只是对老方法做的一种兼容
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Implementor implementor1 = new ConcreteImplementor1();
        Bridge bridge1 = new Bridge(implementor1);
        bridge1.request();

        Implementor implementor2 = new ConcreteImplementor2();
        Bridge bridge2 = new Bridge(implementor2);
        bridge2.request();
    }
}
