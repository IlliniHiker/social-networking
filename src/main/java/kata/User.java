package kata;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private Map<String, User> following = new HashMap<>();
    private Map<Integer, Message> messages = new HashMap<>();

    public String getName() { return this.name; }
    public Map<String, User> getFollowing() { return this.following; }
    public Map<Integer, Message> getMessages() { return this.messages; }

    public User(String Name) {
        name = Name;
        Wall.addUser(this);
    }

    public void followUser(User user) {
        following.put(user.getName(), user);
    }

    public void postMessage(String Message) {
        Message message = new Message(this, Message);
        messages.put(message.getId(), message);
    }
}
