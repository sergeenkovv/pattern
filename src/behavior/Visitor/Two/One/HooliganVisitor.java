package behavior.Visitor.Two.One;

public class HooliganVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Завел двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Постучал по кузову");
    }
}
