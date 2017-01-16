package creational.builder.builder.impl;

import creational.builder.builder.Builder;

/**
 * Created by jason-geng on 1/16/17.
 */
public class ConcreteBuilder implements Builder {

    public void productA() {
        System.out.println("A Style");
    }

    public void productB() {
        System.out.println("B Style");
    }

    public void productC() {
        System.out.println("C Style");
    }
}
