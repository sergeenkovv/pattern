package creational.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        

        System.out.println("\n===============================\n");
        System.out.println(masterClone);

    }
}

//                Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
//                System.out.println(master);
//
//                master.setId(3);
//                master.setProjectName("dadas");
//                master.setSourceCode("S s = new S()");
//
//                Integer id = master.getId();
//                String name = master.getProjectName();
//                String source = master.getSourceCode();
//
//                ProjectFactory factory = new ProjectFactory(master);
//
//                factory.setProject(new Project(id, name, source));
//                Project masterClone2 = factory.cloneProject();
//                System.out.println(masterClone2);
//                } в выводе будет:
//    Project{id=1, projectName='SuperProject', sourceCode='SourceCode sourceCode = new SourceCode();'}
//    Project{id=3, projectName='dadas', sourceCode='S s = new S()'}

//        Шаблон: Прототип (Prototype)
//
//        Цель:
//        Определить вид создаваемых объектов с помощью экземпляра - прототипа и создавать новые объекты,
//        копируя этот прототип.
//
//        Для чего используется:
//        Для создания копий заданного объекта.
//
//        Пример использования :
//        — классы, экземпляры которых необходимо создать определяются во время выполнения програмыј
//        — для избежания построения иерархии классов, фабрик или параллельных иерархий классов;
//        — экземпляры класса могут находиться в одном из немногих возможных состояний.
