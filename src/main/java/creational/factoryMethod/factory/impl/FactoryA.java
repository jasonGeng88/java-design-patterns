package creational.factoryMethod.factory.impl;

import creational.factoryMethod.factory.Factory;
import creational.factoryMethod.product.Product;
import creational.factoryMethod.product.impl.ProductA;

/**
 * Created by jason-geng on 1/13/17.
 */
public class FactoryA implements Factory {
    public Product create() {
        return new ProductA();
    }
}
