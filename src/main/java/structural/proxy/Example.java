package structural.proxy;

/**
 * 代理模式
 * 通过代理对象来完成对实际对象的操作, 并可在此操作上添加自己的业务逻辑, 如日志记录. AOP中大量使用了代理模式
 * 代理模式分为静态代理和动态代理
 * 本例为静态代理, 在代理类中硬编码了所需的实现对象, 扩展困难
 * 动态代理通过反射的机制来完成动态生成实现对象,JAVA中主要有两种实现动态代理的方式
 *  1. jdk自带的动态代理就是基于这种机制（只能通过接口来实现）
 *  2. cglib 可以通过类的方式来实现动态代理
 *  目前, jdk的动态代理在各方面的性能上已经超过了cglib, cglib的优势已经没有那么大了.
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Target target = new Proxy();
        target.operate();
    }
}
