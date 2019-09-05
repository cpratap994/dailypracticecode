package pattern.behavioralpattern.commandpattern;

//invoker
public class Switch {

    public void storeAndExecute(Command cmd){
        cmd.execute();
    }
}
