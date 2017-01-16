package structural.proxy;

/**
 * Created by jason-geng on 1/16/17.
 */
public class ConcreteTarget implements Target {

    public void operate() {
        System.out.println("it's a ConcreteTarget");
    }
}
