package behavior.Memento.One;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github...");
        githubRepo.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code...");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1.");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("Rolling back to Version 1.0");
        project.load(githubRepo.getSave());

        System.out.println("Project after rollback: ");
        System.out.println(project);
    }
}

//шаблон Memento, поведенческий шаблон проектирования,
// позволяющий зафиксировать и сохранить внутреннее состояние объекта так, чтобы позднее восстановить его в это состояние.

//Шаблон: Хранитель (Memento)
//
//Цель:
//Сохранить внутренне состояние объекта за его пределы.
//
//Для чего используется:
//Фиксирование внутреннего состояния объекта за его пределами не нарушая инкапсуляцию и восстановления объекта в случае необходимости.
//
//Пример использования:
//- необходимо сохранить текущее состояние объекта или его части и восстановление в будущем, но прямое получение состояния раскрывает детали реализации и нарушает инкапсуляцию объекта.