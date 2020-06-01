package kata;

public class MessageId {
    private static Integer currentId = 0;

    private MessageId() {}

    public static Integer getNextId() { return ++currentId; }
}
