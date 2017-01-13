package creational.abstractFactory;

import creational.abstractFactory.factory.Factory;
import creational.abstractFactory.factory.impl.Factory1;
import creational.abstractFactory.factory.impl.Factory2;
import creational.abstractFactory.productA.ProductA;
import creational.abstractFactory.productB.ProductB;

/**
 * 抽象工厂方法
 * 主要是对工厂方法的一种扩展
 *  -  工厂模式是一个工厂生产一个产品
 *  -  抽象工厂是一个工厂生产多个产品
 * Created by jason-geng on 1/13/17.
 */
public class Example {

    public static void main(String[] args) {
        Factory f1 = new Factory1();
        ProductA a1 = f1.createA();
        ProductB b1 = f1.createB();
        a1.useA();
        b1.useB();

        Factory f2 = new Factory2();
        ProductA a2 = f2.createA();
        ProductB b2 = f2.createB();
        a2.useA();
        b2.useB();
    }
}
