package structural.bridge;

import structural.bridge.implementor.Implementor;

/**
 * Created by jason-geng on 1/16/17.
 */
public class Bridge {
    private Implementor implementor;

    public Bridge(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request(){
        implementor.operate();
    }
}

