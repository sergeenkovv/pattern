package creational.Abstract_Factory.website;

import creational.Abstract_Factory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void ManageProject() {
        System.out.println("Website PM manages website project...");
    }
}
