package creational.abstractFactory.factory.impl;

import creational.abstractFactory.factory.Factory;
import creational.abstractFactory.productA.ProductA;
import creational.abstractFactory.productA.impl.ProductA2;
import creational.abstractFactory.productB.ProductB;
import creational.abstractFactory.productB.impl.ProductB2;

/**
 * Created by jason-geng on 1/13/17.
 */
public class Factory2 implements Factory {
    public ProductA createA() {
        return new ProductA2();
    }

    public ProductB createB() {
        return new ProductB2();
    }
}
