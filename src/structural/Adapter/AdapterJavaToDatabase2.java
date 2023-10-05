package structural.Adapter;

public class AdapterJavaToDatabase2 implements Database {
    JavaApplication javaApplication = new JavaApplication();

    @Override
    public void insert() {
        javaApplication.saveObject();
    }

    @Override
    public void update() {
        javaApplication.updateObject();
    }

    @Override
    public void select() {
        javaApplication.selectObject();

    }

    @Override
    public void remove() {
        javaApplication.deleteObject();
    }
}
