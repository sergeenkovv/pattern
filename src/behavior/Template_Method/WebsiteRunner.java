package behavior.Template_Method;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n==============================================\n");

        newsPage.showPage();
    }
}
//Шаблонный метод  - это метод, внутренние блоки которого могут переопределяться подклассами для избежания повторного копирования.

//Шаблон: Шаблонный метод (Template method)
//Цель:
//Определение основы класса и создание возможности подклассам переопределять его части.
//Для чего используется:
//Определяет основу класса и позволяет подклассам переопределять некоторые его части не изменяя его структуру в целом.
//Пример использования:
//- однократное использование различных частей класса, оставляя реализацию изменяющегося поведения на усмотрение подклассов:
//- вычленение и локализация общего для всех подклассов поведения в родительском;
//управление расширениями подклассов.