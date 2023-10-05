package structural.Adapter;

public class DatabaseRunner {
    public static void main(String[] args) {

        //1-й способ через наследование
        Database database = new AdapterJavaToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();

        //2-й способ через композицию
        Database database2 = new AdapterJavaToDatabase2();
        database2.insert();
        database2.update();
        database2.select();
        database2.remove();
    }
}

//        Шаблон: Адаптер (Adapter)
//
//        Цель:
//        Преобразование интерфейса одного класса в интерфейс того класса, который необходим клиенту
//
//        Для чего используется:
//        Для обеспечения совместной работы классов, интерфейсы которых не совместимы.
//
//        Пример использования:
//        — интерфейс класса, который мы хотим использовать не соответствует нашим потребностям;
//        — необходим класс, который должен взаимодействовать с классами, ксторые ему неизвестны
//        или не связаны с Ним;
//        — необходимо использовать несколько существующих подклассов, но нецелесообразно использовать
//        методы этих классов создавая иж новые подклассы.