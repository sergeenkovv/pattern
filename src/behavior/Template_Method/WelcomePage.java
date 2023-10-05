package behavior.Template_Method;

public class WelcomePage extends WebsiteTemplate{
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
