package structural.decorator.component.impl;

import structural.decorator.component.Component;

/**
 * Created by jason-geng on 1/16/17.
 */
public class ConcreteComponent implements Component {
    public void operate() {
        System.out.println("it's a ConcreteComponent");
    }
}
