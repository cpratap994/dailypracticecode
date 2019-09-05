package pattern.condition;

public class Condition1 implements Condition {

    private String flag;

    public Condition1(String flag) {
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
