package behavior.Observer.One;

import java.util.List;

//ConcreteObserver
public class Subsctiber implements Observer{
    String name;

    public Subsctiber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies
                + "\n ==============================================\n");
    }
}
