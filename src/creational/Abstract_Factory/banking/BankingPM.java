package creational.Abstract_Factory.banking;

import creational.Abstract_Factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void ManageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
