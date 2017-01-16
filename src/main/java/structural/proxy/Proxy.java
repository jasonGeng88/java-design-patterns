package structural.proxy;

/**
 * Created by jason-geng on 1/16/17.
 */
public class Proxy implements Target {

    private Target target;

    public Proxy() {
        this.target = new ConcreteTarget();
    }

    public void operate() {
        System.out.println("before action");
        target.operate();
        System.out.println("after action");
    }
}
