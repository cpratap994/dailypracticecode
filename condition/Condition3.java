package pattern.condition;

public class Condition3 implements Condition {

   private String flag;

    public Condition3(String flag) {
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
