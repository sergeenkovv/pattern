package behavior.Mediator.One;

import java.util.ArrayList;
import java.util.List;

//ConcreteMediator
public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
 //           if (u != user && admin instanceof Admin) { //проверяет не является ли user отправителем данного сообщения
                u.getMessage(message); /*раскоменьть строку выше чтобы посмотреть что будет*/
//            }
        }
        admin.getMessage(message);
    }
}