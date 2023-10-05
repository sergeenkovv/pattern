package behavior.Visitor.One;

//ConcreteElementA
public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
