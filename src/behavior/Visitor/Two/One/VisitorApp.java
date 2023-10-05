package behavior.Visitor.Two.One;

public class VisitorApp {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor hooligan = new HooliganVisitor();
        Visitor mechanic = new MechanicVisitor();

        body.accept(hooligan);
        engine.accept(hooligan);

        System.out.println("=============================");

        body.accept(mechanic);
        engine.accept(mechanic);
    }
}
