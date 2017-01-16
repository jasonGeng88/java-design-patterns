package structural.decorator;

import structural.decorator.component.Component;
import structural.decorator.component.impl.ConcreteComponent;

/**
 * 装饰器模式
 * 在原有的方法上增加一些新的特性
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decorator = new Decorator(component);

        decorator.operate();
    }
}
