package creational.singleton;

/**
 * 单例模式
 * 优点: 只初始化一次实例
 * 注意:
 *  1.禁止new来实例化
 *  1.创建方法设为static
 * Created by jason-geng on 1/13/17.
 */
public class Example {

    public static void main(String[] args) {
        Product product1 = Singleton.create();
        Product product2 = Singleton.create();
        Product product3 = Singleton.create();
        product1.use();
        product2.use();
        product3.use();
    }
}
