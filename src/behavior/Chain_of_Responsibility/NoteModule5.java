package behavior.Chain_of_Responsibility;

public class NoteModule5 extends NoteModule {

    public NoteModule5(int num) {
        super();
    }

    @Override
    public void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.R5.getNum();
        int remind = money.getAmt() % Note.R5.getNum();
        if (countNote > 0) {
            System.out.println("Видало " + countNote + " купюр достоинством " + Note.R5.getNum());
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
