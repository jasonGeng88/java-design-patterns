package structural.decorator;

import structural.decorator.component.Component;

/**
 * Created by jason-geng on 1/16/17.
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operate() {
        System.out.println("it's a decorator");
        component.operate();
    }

}
