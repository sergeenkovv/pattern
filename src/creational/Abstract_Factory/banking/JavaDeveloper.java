package creational.Abstract_Factory.banking;

import creational.Abstract_Factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
