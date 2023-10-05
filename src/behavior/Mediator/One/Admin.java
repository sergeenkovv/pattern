package behavior.Mediator.One;

//ConcreteAggregate (ConcreteColleague)
public class Admin implements User {
    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Администартор " + this.name + " получает сообщение: '" + message + "'");
    }
}
