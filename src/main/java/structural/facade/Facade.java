package structural.facade;

import structural.facade.system.SystemA;
import structural.facade.system.SystemB;
import structural.facade.system.SystemC;

/**
 * Created by jason-geng on 1/16/17.
 */
public class Facade {

    public void wrapOperate(){
        SystemA systemA = new SystemA();
        SystemB systemB = new SystemB();
        SystemC systemC = new SystemC();

        systemA.operateA();
        systemB.operateB();
        systemC.operateC();
    }
}
