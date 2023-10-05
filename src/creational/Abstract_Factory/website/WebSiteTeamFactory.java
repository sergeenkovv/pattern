package creational.Abstract_Factory.website;

import creational.Abstract_Factory.Developer;
import creational.Abstract_Factory.ProjectManager;
import creational.Abstract_Factory.ProjectTeamFactory;
import creational.Abstract_Factory.Tester;
import creational.Abstract_Factory.banking.QATester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
