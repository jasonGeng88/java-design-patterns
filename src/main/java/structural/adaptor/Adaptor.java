package structural.adaptor;

/**
 * Created by jason-geng on 1/16/17.
 */
public class Adaptor implements Target {

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.use();
    }
}
