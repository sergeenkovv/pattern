package creational.Abstract_Factory.website;

import creational.Abstract_Factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
