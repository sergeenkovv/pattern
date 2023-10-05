package behavior.Visitor.Two.Two;

public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Проверил двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Отполировал кузов");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Проверил внешний вид автомобиля");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Подкачал " + wheel.getName() + " колеса");
    }
}
