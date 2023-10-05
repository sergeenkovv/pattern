package behavior.Mediator.One;

//ConcreteAggregate (ConcreteColleague)
public class SimpleUser implements User{
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println("Пользователь " + this.name + " получает сообщение: '" + message + "'");
    }
}
