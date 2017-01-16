package structural.flyweight.flyweight.impl;

import structural.flyweight.flyweight.Flyweight;

/**
 * Created by jason-geng on 1/16/17.
 */
public class ConcreteFlyweight implements Flyweight {

    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    public void operate() {
        System.out.println("it's a ConcreteFlyweight " + name);
    }

}
