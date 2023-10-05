package behavior.Mediator.Two;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Не хватает прав");
        }
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("В чате нет админа");
        }
        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Админ не может входить в другой чат!");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Admin) {
            for (User u : users) {
                u.getMessage(user.getName() + ": " + message);
            }
        }
        if (user instanceof SimpleUser) {
            for (User u : users) {
                if (u != user && u.isEnable()) {
                    u.getMessage(user.getName() + ": " + message);
                }
            }
            if (admin.isEnable()) {
                admin.getMessage(user.getName() + ": " + message);
            }
        }
    }
}