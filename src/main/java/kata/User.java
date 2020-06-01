package kata;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private Map<String, User> following = new HashMap<String, User>();

    public String getName() { return this.name; }
    public Map<String, User> getFollowing() { return this.following; }

    public User(String Name) {
        name = Name;
    }

    public void followUser(User user) {
        following.put(user.getName(), user);
    }
}
