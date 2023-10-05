package behavior.Command;

//Invoker
public class User {
    Command /*StartCommand*/ start;
    Command /*StopCommand*/ stop;
    Command /*ResetCommand*/ reset;

    public User(Command /*StartCommand*/ start, Command /*StopCommand*/ stop, Command /*ResetCommand*/ reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }
    public void startComp() {
        start.execute();
    }
    public void stopComp() {
        stop.execute();
    }
    public void resetComp() {
        reset.execute();
    }
}
//

