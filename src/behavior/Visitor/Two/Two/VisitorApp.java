package behavior.Visitor.Two.Two;

public class VisitorApp {
    public static void main(String[] args) {
        Element car = new CarElement();

        HooliganVisitor hooligan = new HooliganVisitor();
        MechanicVisitor mechanic = new MechanicVisitor();

        car.accept(hooligan);

        System.out.println("\n=================\n");
        car.accept(mechanic);
//        Element body = new BodyElement();
//        Element engine = new EngineElement();
//        Visitor hooligan = new HooliganVisitor();
//        Visitor mechanic = new MechanicVisitor();
//
//        body.accept(hooligan);
//        engine.accept(hooligan);
//
//        System.out.println("\n======================\n");
//
//        body.accept(mechanic);
//        engine.accept(mechanic);
    }
}
