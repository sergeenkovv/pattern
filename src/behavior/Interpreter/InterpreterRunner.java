package behavior.Interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer kniws Java Core " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));

    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javacore = new TerminalExpression("Java Core");

        return new OrExpression(java, javacore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
//Шаблон проектирования Интерпретатор позволяет описать алгоритм со своей грамматикой и определенными правилами для решения конкретной задачи.
// Короче говоря, данный шаблон позволяет описать механизм вычисления конкретной задачи с заданным синтаксисом

//Шаблон: интерпретатор (Interpreter)
//
//Цель:
//Определение представления грамматики объекта
//
//Для чего используется:
//используется для определения представления грамматики заданного языка и интерпретации его предложений
//
//Пример использования:
//упрощение иерархии классов с помощью интерпретирования.