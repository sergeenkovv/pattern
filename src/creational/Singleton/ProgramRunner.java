package creational.Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
//Шаблон Singleton позволяет создавать единственный экземпляр класса.
// У класса есть только один экземпляр, и он предоставляет к нему глобальную точку доступа. Пример приводится на языке программирования Java.

//        Одиночка (Singleton)
//        ==============================================
//        Цель:
//
//        Гарантировать, что у класса будет только один единственный экземляр и к нему будет предоставлена глобальная точка доступа.
//
//        для чего используется:
//        для создания единственного экземпляра опредленного класса.
//
//        ============================================
//        Пример использования:
//        -необходим только один экземпляр конкретного класса, который доступен пля всех клиентов;
//        - единственный экземпляр должен наследоваться путём порождения подклассов, при этом, клиенты
//        имеют возможность работать с классом-неследником без модификации своего кода.
//        =============================================
