package structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    }
}

// Шаблон проектирования Flyweight (Приспособленец) предназначен для уменьшения количества объектов в приложении путем совместного их использования.

// Flyweight дополняет шаблон Factory Method таким образом, что при обращении клиента к Factory Method для создания нового объекта ищет уже созданный объект с такими же параметрами
// что и у требуемого, и возвращает его клиенту. Если такого объекта нет, то фабрика создаст новый.

//Flyweight - оптимизирующий паттерн, то есть его ответственность - создавать новый объект когда это действительно нужно,  в остальных случаях возвращать существующий, тем самым экономя память.
// Поэтому это сильно отличается от синглтона.

//        Flyweight - оптимизирующий паттерн, то есть его ответственность - создавать новый объект когда это действительно нужно, в остальных случаях возвращать существующий, тем самым экономя память. Поэтому это сильно отличается от синглтона.
//        Шаблон: Приспособленец (Flyweight)
//
//        Цель:
//        Поддержка множества мелких объектов.
//
//        Для чего используется:
//        использует разделение для того, чтобы поддерживать много мелких объектов.
//
//        Пример использования:
//        — когда используется большое число объектов;
//        — большую часть состояния объектов можно вынести наружу;
//        — приложение не зависит от идентичности объекта.

// как может помочь шаблон Flyweight? он создаст 1 экземпляр объекта (в DeveloperFactory). и просто будет его переиспользовать тогда, когда нужно (когда будет вызов в main)
// в классе DeveloperFactory (Flyweight) используется шаблон Abstract Factory(загляни в WebSiteTeamFactory и в BankingTeamFactory). т.е. в шаблоне Flyweight используется шаблон Flyweight
