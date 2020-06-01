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
        assertEquals(user2, user1.getFollowing().get(userName2));
    }
}