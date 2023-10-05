package behavior.Mediator.Two;

public class ChatRunner {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Иван Иваныч");
        User user1 = new SimpleUser(chat, "Ваня");
        User user2 = new SimpleUser(chat, "Вова");
        User user3 = new SimpleUser(chat, "Саша");
        user2.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.sendMessage("Привет");
    }
}
