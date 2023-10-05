package behavior.Mediator.Two;

public class Admin extends User{
    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void getMessage(String message) {
        System.out.println("Администратор " + getName() + " получает сообщение '" + message + "'");
    }
}
