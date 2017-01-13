package creational.abstractFactory.factory.impl;

import creational.abstractFactory.factory.Factory;
import creational.abstractFactory.productA.ProductA;
import creational.abstractFactory.productA.impl.ProductA1;
import creational.abstractFactory.productB.ProductB;
import creational.abstractFactory.productB.impl.ProductB1;

/**
 * Created by jason-geng on 1/13/17.
 */
public class Factory1 implements Factory {
    public ProductA createA() {
        return new ProductA1();
    }

    public ProductB createB() {
        return new ProductB1();
    }
}
