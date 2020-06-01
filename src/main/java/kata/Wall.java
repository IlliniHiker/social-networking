package kata;

import java.util.HashMap;
import java.util.Map;

public class Wall {
    private static final Map<String, User> users = new HashMap<String, User>();

    private Wall() {}

    public static Map<String, User> getUsers() { return users; }

    public static void addUser(User user) {
        users.put(user.getName(), user);
    }
}
