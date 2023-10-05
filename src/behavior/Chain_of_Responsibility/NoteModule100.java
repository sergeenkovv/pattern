package behavior.Chain_of_Responsibility;

public class NoteModule100 extends NoteModule {

    public NoteModule100(int num) {
        super();
    }

    @Override
    public void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.R100.getNum();
        int remind = money.getAmt() % Note.R100.getNum();
        if (countNote > 0) {
            System.out.println("Выдало " + countNote + " купюр достоинством " + Note.R100.getNum());
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
