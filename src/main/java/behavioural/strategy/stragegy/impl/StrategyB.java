package behavioural.strategy.stragegy.impl;

import behavioural.strategy.stragegy.Strategy;

/**
 * Created by jason-geng on 1/17/17.
 */
public class StrategyB implements Strategy {

    public void algorithm(int value) {
        System.out.println("strategy B: the result is " + value * 20);
    }

}
