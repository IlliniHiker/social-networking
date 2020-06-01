package kata;

public class UserId {
    private static Integer currentId = 0;

    private UserId() {}

    public static Integer getNextId() { return ++currentId; }
}
