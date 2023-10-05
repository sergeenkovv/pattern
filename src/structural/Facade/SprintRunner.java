package structural.Facade;

public class SprintRunner {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblems();
//
//        Job job = new Job();
//        job.doJob();
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.startSprint();
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
//
//        bugTracker.finishSprint();
//        developer.doJobBeforeDeadline(bugTracker);
    }
}

// паттерн Facade - структурный шаблон проектирования, позволяющий скрыть сложность системы путем сведения всех возможных внешних вызовов к одному объекту,
// делегирующему их соответствующим объектам системы.

//        Шаблон: Фасад (Facade)
//
//        Цель:
//        Предоставить унифицированный интерфейс вместо нескольких интерфейсов подсистемы.
//
//        Для чего используется:
//        используется для опредления интерфейса высокого уровня, который упрощает использование подсистемы.
//
//        Пример использования:
//        — изолирование клиентов от компонентов подсистемы, упрощая работу с ней;
//        — необходимость ослабления связанности подсистемы с клиентами;
