package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WallTest {
    @Test
    void testAddUserToWall() {
        String userName = "Alice";
        User user1 = new User(userName);

        assertEquals(userName, Wall.getUsers().entrySet().iterator().next().getValue().getName());
    }

    @Test
    void testAddMessageToWall() {
        String userName = "Alice";
        User user1 = new User(userName);

        String message = "I love the weather today!";
        user1.postMessage(message);

        assertEquals(message, Wall.getMessages().entrySet().iterator().next().getValue().getMessage());
    }
}
