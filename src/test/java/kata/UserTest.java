package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void testNewUser() {
        String userName = "Alice";
        User user1 = new User(userName);
        assertEquals(userName, user1.getName());
    }

    @Test
    void testUserFollowing() {
        String userName1 = "Alice";
        String userName2 = "Bob";
        User user1 = new User(userName1);
        User user2 = new User(userName2);
        user1.followUser(user2);
        Integer user2Id = user2.getId();
        assertEquals(user2, user1.getFollowing().get(user2Id));
    }

    @Test
    void testPostMessage() {
        String userName = "Alice";
        User user = new User(userName);
        String message = "I love the weather today!";
        user.postMessage(message);

        assertEquals(message, user.getMessages().entrySet().iterator().next().getValue().getMessage());
    }
}