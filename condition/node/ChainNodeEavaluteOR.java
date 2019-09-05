package pattern.condition.node;

import pattern.condition.Condition;

public class ChainNodeEavaluteOR  {

    Condition condition;
    ChainNodeEavaluteOR nextNode;

    public ChainNodeEavaluteOR(Condition condition, ChainNodeEavaluteOR nextNode) {
        this.condition = condition;
        this.nextNode = nextNode;
    }

    public String evaluateCondition(ChainNodeEavaluteOR chain) {
        ChainNodeEavaluteOR node = chain;
        while (node != null){

        if(node.condition.evaluate()){
            return node.condition.getFlag();
        }

        node = node.nextNode;
    }
        return null;
    }
}
