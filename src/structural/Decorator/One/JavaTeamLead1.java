package structural.Decorator.One;

public class JavaTeamLead1 extends DeveloperDecorator1 {
    public JavaTeamLead1(Developer1 developer) {
        super(developer);
    }

    public void sendWeekReport1() {
        System.out.print("Send week report to customer. ");
    }

    @Override
    public void makeJob1() {
        super.makeJob1();
        sendWeekReport1();
    }
}
