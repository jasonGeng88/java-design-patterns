package behavioural.strategy.stragegy.impl;

import behavioural.strategy.stragegy.Strategy;

/**
 * Created by jason-geng on 1/17/17.
 */
public class StrategyA implements Strategy {

    public void algorithm(int value) {
        System.out.println("strategy A: the result is " + value * 2);
    }

}
