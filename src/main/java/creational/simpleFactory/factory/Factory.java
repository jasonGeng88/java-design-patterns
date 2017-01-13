package creational.simpleFactory.factory;

import creational.simpleFactory.product.Product;
import creational.simpleFactory.product.impl.ProductA;
import creational.simpleFactory.product.impl.ProductB;

/**
 * Created by jason-geng on 1/13/17.
 */
public class Factory {

    public Product create(String name){
        if ("a".equals(name)){
            return new ProductA();
        }
        else if("b".equals(name)){
            return new ProductB();
        }
        return null;
    }
}
