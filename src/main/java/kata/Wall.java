package kata;

import java.util.HashMap;
import java.util.Map;

public class Wall {
    private static Map<String, User> users = new HashMap<String, User>();
    private static Map<Integer, Message> messages = new HashMap<Integer, Message>();

    private Wall() {}

    public static Map<String, User> getUsers() { return users; }
    public static Map<Integer, Message> getMessages() { return messages; }

    public static void addUser(User user) {
        users.put(user.getName(), user);
    }

    public static void addMessage(Message message) {
        messages.put(message.getId(), message);
    }
}
