package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserIdTest {
    @Test
    void testGetNextId() {
        Integer firstId = UserId.getNextId();
        Integer secondId = UserId.getNextId();

        assertEquals(firstId, secondId - 1);
    }
}
