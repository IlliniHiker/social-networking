package kata;

import java.util.HashMap;
import java.util.Map;

public class Wall {
    private static Map<Integer, User> users = new HashMap<Integer, User>();
    private static Map<Integer, Message> messages = new HashMap<Integer, Message>();

    private Wall() {}

    public static Map<Integer, User> getUsers() { return users; }
    public static Map<Integer, Message> getMessages() { return messages; }

    public static void addUser(User user) {
        users.put(user.getId(), user);
    }

    public static void addMessage(Message message) {
        messages.put(message.getId(), message);
    }
}
