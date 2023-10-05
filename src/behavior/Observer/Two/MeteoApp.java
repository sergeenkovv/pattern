package behavior.Observer.Two;

public class MeteoApp {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());

        station.setMeasurements(25, 760);
    }
}
