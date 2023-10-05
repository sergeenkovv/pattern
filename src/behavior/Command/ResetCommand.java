package behavior.Command;

//ConcreteCommand
public class ResetCommand implements Command {
    Comp computer;

    public ResetCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}