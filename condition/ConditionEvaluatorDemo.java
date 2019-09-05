package pattern.condition;

import pattern.condition.node.ChainNodeEavaluteOR;

public class ConditionEvaluatorDemo {

    public static void main(String[] args) {
        Condition1 condition1 = new Condition1("flag1");
        Condition2 condition2 = new Condition2("flag2");
        Condition3 condition3 = new Condition3("flag3");

        ConditionFactory factory = new ConditionFactory();
        ChainNodeEavaluteOR chain = factory.createFactory(condition1,condition2,condition3);

        System.out.println(chain.evaluateCondition(chain));

    }
}
