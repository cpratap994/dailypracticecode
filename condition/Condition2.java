package pattern.condition;

public class Condition2 implements Condition {

    private String flag;

    public Condition2(String flag) {
        this.flag = flag;
    }

    @Override
    public String getFlag() {
        return this.flag;
    }

    @Override
    public boolean evaluate() {
        return false;
    }
}
