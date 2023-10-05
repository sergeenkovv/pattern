package behavior.Observer.One;

import java.util.List;

//Наблюдатель
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
