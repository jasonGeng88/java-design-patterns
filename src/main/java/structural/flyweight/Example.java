package structural.flyweight;

import structural.flyweight.flyweight.Flyweight;

/**
 * 享元模式
 * 解决系统中过多的重复的对象, 通过共享技术实现对象的重用
 * 类似单例模式, 但不同的是可以通过外部参数来获取不同的对象（内部状态共享,外部状态独立）
 * 主要使用享元池来实现共享对象
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Flyweight fa1 = FlyweightFactory.get("a");
        fa1.operate();

        Flyweight fa2 = FlyweightFactory.get("a");
        fa2.operate();

        Flyweight fb = FlyweightFactory.get("b");
        fb.operate();

    }
}
