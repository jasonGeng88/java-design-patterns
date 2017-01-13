package creational.singleton;

/**
 * Created by jason-geng on 1/13/17.
 */
public class Singleton {

    private static Product product;

    private Singleton() {
    }

    public static Product create(){
        if (Singleton.product == null){
            System.out.println("init product");
            Singleton.product = new Product();
        }
        return Singleton.product;
    }
}
