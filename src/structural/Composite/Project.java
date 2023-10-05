package structural.Composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.writeCode();
    }
}

//        Шаблон: компоновщик (Composite)
//
//        Цель:
//        Скомонровать объекты в структуры по типу "дерева", позволяя клиентам единообразно трактовать отдельные и составные объекты.
//
//        для чего используется:
//        Дла группировки мелких компонентов в более крупные, которые, в свою очередь, могут стать основой для
//        вще более крупных стуктур.
//
//        Пример использования:
//        — для представления иерархии "часть-целое";
//        — мы хотим, чтобы клиенты одним способом трактовали как отдельные, так и составные объекты.
