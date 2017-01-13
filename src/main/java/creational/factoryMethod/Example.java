package creational.factoryMethod;

import creational.factoryMethod.factory.Factory;
import creational.factoryMethod.factory.impl.FactoryA;
import creational.factoryMethod.factory.impl.FactoryB;
import creational.factoryMethod.product.Product;

/**
 * 工厂模式
 * 优点: 符合开闭原则
 * 缺点: 实现比简单工厂要复杂
 * Created by jason-geng on 1/13/17.
 */
public class Example {

    public static void main(String[] args) {

        Factory fa = new FactoryA();
        Factory fb = new FactoryB();

        Product a = fa.create();
        Product b = fb.create();

        a.use();
        b.use();
    }
}
