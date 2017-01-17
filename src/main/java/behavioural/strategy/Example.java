package behavioural.strategy;

import behavioural.strategy.stragegy.Strategy;
import behavioural.strategy.stragegy.impl.StrategyA;
import behavioural.strategy.stragegy.impl.StrategyB;

/**
 * 策略模式
 * 使算法实现独立于客户而变化, 解决了在代码中硬编码某种算法的场景.
 * Created by jason-geng on 1/16/17.
 */
public class Example {

    public static void main(String[] args) {
        Strategy sa = new StrategyA();
        Strategy sb = new StrategyB();

        Context context = new Context(1);

        context.setAlgorithm(sa);
        context.run();

        context.setAlgorithm(sb);
        context.run();
    }

}
