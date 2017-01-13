package creational.simpleFactory;

import creational.simpleFactory.factory.Factory;
import creational.simpleFactory.product.Product;

/**
 * 简单工厂方法
 * 优点: 通过统一工厂生成不同产品
 * 缺点: Factory 违反了开闭原则
 * Created by jason-geng on 1/13/17.
 */
public class Example {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Product a =factory.create("a");
        Product b =factory.create("b");

        a.use();
        b.use();
    }
}
