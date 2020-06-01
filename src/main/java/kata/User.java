package kata;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private Map<Integer, User> following = new HashMap<>();
    private Map<Integer, Message> messages = new HashMap<>();
    private Integer id;

    public String getName() { return this.name; }
    public Map<Integer, User> getFollowing() { return this.following; }
    public Map<Integer, Message> getMessages() { return this.messages; }
    public Integer getId() { return this.id; }

    public User(String Name) {
        name = Name;
        id = UserId.getNextId();
        Wall.addUser(this);
    }

    public void followUser(User user) {
        following.put(user.getId(), user);
    }

    public void postMessage(String Message) {
        Message message = new Message(this, Message);
        messages.put(message.getId(), message);
    }
}
