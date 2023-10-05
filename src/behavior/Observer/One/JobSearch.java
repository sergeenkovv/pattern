package behavior.Observer.One;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subsctiber("Eugene Suleimanov");
        Observer secondSubscriber = new Subsctiber("Ivan Sergeenkov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");
    }
}
//Шаблон Observer часто применяют в ситуациях, в которых отправитель сообщений не должен или не хочет знать, что делают получатели с предоставленной им информацией.
// Его задача — лишь разослать информацию всем, кому она нужна.

// Observer очень близок к Mediator но есть  отличия.
//Шаблон: Наблюдатель (Observer)
//
//Цель:
//Определение зависимости "один ко многим" между объектами.
//
//Для чего используется:
//Определение зависимости "один ко многим" между объектами таким образом, что при изменении состояния одного объекта все зависящие от него объекты были уведомлены об этом и обновились.
//
//Пример использования:
//— когда у модели имеются два аспекта, один из которых зависит от другого. Инкапсулирование этих аспектов в разные классы позволяют использовать их независимо друг от друга;
//— когда один объект должен оповещать другие и не делать предположений об этих объектах;
//— ослабление связи между объектами.