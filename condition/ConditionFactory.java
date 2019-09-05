package pattern.condition;

import pattern.condition.node.ChainNodeEavaluteOR;

public class ConditionFactory {

    public ChainNodeEavaluteOR createFactory(Condition ...conditions){

        ChainNodeEavaluteOR chainNode =null;

        if(conditions.length >= 1){
         for(int i = conditions.length-1; i >= 0; i--){
                chainNode = new ChainNodeEavaluteOR(conditions[i],chainNode);
         }
        }

        return chainNode;
    }
}
