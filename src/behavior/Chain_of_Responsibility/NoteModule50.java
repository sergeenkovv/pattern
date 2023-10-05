package behavior.Chain_of_Responsibility;

public class NoteModule50 extends NoteModule {

    public NoteModule50(int num) {
        super();
    }

    @Override
    public void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.R50.getNum();
        int remind = money.getAmt() % Note.R50.getNum();
        if (countNote > 0) {
            System.out.println("Видало " + countNote + " купюр достоинством " + Note.R50.getNum());
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
