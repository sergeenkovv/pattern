package creational.Abstract_Factory;

import creational.Abstract_Factory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.ManageProject();
    }
}

// Шаблон Abstract Factory реализуется созданием абстрактного класса Factory, который представляет собой интерфейс для создания компонентов системы.
// Затем пишутся классы, реализующие этот интерфейс.

//Шаблон: Фабрика (Factory Method)
//        =======================================================================================================
//        Цель:
//
//        Создание интерфейса, который создаёт объект. При этом, выбор того, экземпляр какого класса создавать
//        остаётся за классами, которые имплементируют данный интерфейс.
//        =======================================================================================================
//
//        Для чего используется:
//
//        Для делигирования создания экземпляров, другому классу.
//
//        =======================================================================================================
//        Пример использования:
//
//        - заранее неизвестно, экземпляры, какого класса нужно будет создавать;
//        - класс спроектирован таким образом, что создаваемые им объекты имеют свойства определённого класса.
//
//        =======================================================================================================