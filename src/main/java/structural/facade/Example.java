package structural.facade;

/**
 * 外观模式
 * 作为各个子系统的一个统一调用路口
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.wrapOperate();
    }
}
