package structural.Decorator.One;

public class SeniorJavaDeveloper1 extends DeveloperDecorator1 {
    public SeniorJavaDeveloper1(Developer1 developer) {
        super(developer);
    }

    public void makeCodeReview1() {
        System.out.print("Make code review. ");
    }

    @Override
    public void makeJob1() {
        super.makeJob1();
        makeCodeReview1();
    }
}
