package structural.flyweight;

import structural.flyweight.flyweight.Flyweight;
import structural.flyweight.flyweight.impl.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason-geng on 1/16/17.
 */
public class FlyweightFactory {

    public static Map<String, Flyweight> map = new HashMap<String, Flyweight>();

    public static Flyweight get(String name){
        if (map.containsKey(name))
            return map.get(name);

        Flyweight fw = new ConcreteFlyweight(name);
        System.out.println("create a Flyweight object");
        map.put(name, fw);
        return fw;
    }

}
