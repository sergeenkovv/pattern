package behavior.Visitor.Two.Two;

public class HooliganVisitor implements Visitor {

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Пнул " + wheel.getName() + " колесо");
    }
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Завел двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Постучал по кузову");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Покурил внутри машины");
    }
}