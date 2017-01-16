package creational.builder;

import creational.builder.builder.impl.ConcreteBuilder;

/**
 * 建造者模式
 * 将一个复杂的对象,抽象成多个通用的步骤（部件）来完成,至于每个步骤做了什么,我们不需要关心
 * 优势: 统一化构建流程, 不同的构建器可以部件的实现不同,随意替换, 但是实现复杂对象的过程将被标准化
 * Created by jason-geng on 1/13/17.
 */
public class Example {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ConcreteBuilder());
        director.construct();
    }
}
