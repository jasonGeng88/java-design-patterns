package structural.bridge.implementor.impl;

import structural.bridge.implementor.Implementor;

/**
 * Created by jason-geng on 1/16/17.
 */
public class ConcreteImplementor1 implements Implementor {

    public void operate() {
        System.out.println("it's a ConcreteImplementor1");
    }
}
