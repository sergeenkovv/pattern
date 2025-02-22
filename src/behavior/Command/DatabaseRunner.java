package behavior.Command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Comp c = new Comp();

        User u = new User(new StartCommand(c), new StopCommand(c), new ResetCommand(c));

        u.startComp();
//        c.start(); тоже самое
        u.stopComp();
//        c.stop(); тоже самое
        u.resetComp();
//        c.reset(); тоже самое
    }
}

//паттерн Command обеспечивает обработку команды в виде объекта, что позволяет сохранять ее, передавать в качестве параметра методам, а также возвращать ее в виде результата, как и любой другой объект.
// Плюс: Команда позволяет отделить источник события от объекта, который знает, как нужно выполнять запрашиваемую операцию.

//мы наш Comp оборачиваем командами через интерфейс Сommand (наши 3 класса StartCommand, StopCommand, ResetCommand наследуются от интерфейса Comand). и сами команды тоже оборачиваем классом User

//класс User и класс Computer не знают друг о друге ничего. интерфейс и 3 класса играют роль прослойки

//у нас получается двойной Wrapper(Decorator). (продолжение в классах StartCommand, StopCommand, ResetCommand)

//паттерн команда очень похож на Delegate

//Шаблон: команда (Command)
//
//Цель:
//Инкапсулирование запроса в объект.
//
//Для чего используется:
//чтобы задать параметры клиентов для обработки определённых запросов, создание очереди из этих запросе
//или их контроля и поддержки отмены операций.
//
//Пример использования:
//— параметризация объектов выполняемым действием;
//— определять запрос, ставить его в очередь или выполнять его в разное время