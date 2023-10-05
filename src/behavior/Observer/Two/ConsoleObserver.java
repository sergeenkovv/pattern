package behavior.Observer.Two;

public class ConsoleObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Погода изменилась. Температура = " + temp + ", Давление = " + presser + ".");
    }
}
