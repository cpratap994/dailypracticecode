package pattern.behavioralpattern.commandpattern;

public class CommandDemo {


    public static void main(String[] args) {
        Switch aSwitch = new Switch();
        Light light = new Light();

        OnCommand onCommand = new OnCommand(light);
        aSwitch.storeAndExecute(onCommand);
    }
}
