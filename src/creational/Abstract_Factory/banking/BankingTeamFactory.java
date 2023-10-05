package creational.Abstract_Factory.banking;

import creational.Abstract_Factory.Developer;
import creational.Abstract_Factory.ProjectManager;
import creational.Abstract_Factory.ProjectTeamFactory;
import creational.Abstract_Factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
