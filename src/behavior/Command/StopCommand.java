package behavior.Command;

//ConcreteCommand
public class StopCommand implements Command {
    Comp computer;

    public StopCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}