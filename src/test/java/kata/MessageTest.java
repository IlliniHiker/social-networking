package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {
    @Test
    void testNewMessage() {
        String name = "Alice";
        User user = new User(name);

        String message = "I love the weather today!";
        Message message1 = new Message(user, message);

        assertEquals(message, message1.getMessage());
        assertEquals(user, message1.getAuthor());
    }
}
