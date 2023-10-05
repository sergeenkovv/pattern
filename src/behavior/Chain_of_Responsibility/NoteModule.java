package behavior.Chain_of_Responsibility;

public abstract class NoteModule {
    Money money;
    protected NoteModule next;

    public abstract void takeMoney(Money money);

    void setNextMoneyModule(NoteModule module) {
        this.next = module;
    }
}