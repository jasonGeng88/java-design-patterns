package behavioural.state;

import behavioural.state.state.State;
import behavioural.state.state.impl.ConcreteStateA;

/**
 * 状态模式
 * 依据当前状态,来判断生成下一个阶段的状态,
 * 将内部原本复杂的逻辑,转变为状态之间的相互转换,
 * 工作流引擎用的就是此思想,维护了所有状态的关系,通过状态的切换来实现具体的业务处理
 * Created by jason-geng on 1/17/17.
 */
public class Example {

    public static void main(String[] args) {
        State state = new ConcreteStateA();
        Context context = new Context(state);
        context.request();
        context.request();
        context.request();
    }
}
