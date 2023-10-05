package behavior.Visitor.One;

//ConcreteElementB
public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}