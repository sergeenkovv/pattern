package structural.Decorator.One;

public abstract class DeveloperDecorator1 implements Developer1 {

    Developer1 developer;

    public DeveloperDecorator1(Developer1 developer) {
        this.developer = developer;
    }

    @Override
    public void makeJob1() {
        developer.makeJob1();
    }
}
