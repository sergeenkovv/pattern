package behavior.Observer.Two;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    int temperature;
    int pressure;

    List<Observer> observeds = new ArrayList<>();

    public void setMeasurements(int t, int p) {
        temperature = t;
        pressure = p;
        notifyObservers();
    }
    public void addObserver(Observer o) {
        observeds.add(o);

    }
    public void removeObserver(Observer o) {
        observeds.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observeds) {
            o.handleEvent(temperature, pressure);
        }
    }
}
