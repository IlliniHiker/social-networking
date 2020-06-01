package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageIdTest {
    @Test
    void testGetNextId() {
        Integer firstId = MessageId.getNextId();
        Integer secondId = MessageId.getNextId();

        assertEquals(firstId, secondId - 1);
    }
}
