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
}