package structural.adaptor;

/**
 * 适配器模式
 * 类似于现实生活中的转接头,原有的方法与现有的框架不兼容,需要通过一个中间者来连接彼此
 * 场景: 对原有方法的改造
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adaptor(adaptee);
        target.request();
    }
}

