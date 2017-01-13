package creational.abstractFactory.factory;

import creational.abstractFactory.productA.ProductA;
import creational.abstractFactory.productB.ProductB;

/**
 * Created by jason-geng on 1/13/17.
 */
public interface Factory {

    ProductA createA();

    ProductB createB();
}
