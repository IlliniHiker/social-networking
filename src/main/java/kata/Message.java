package kata;

import java.time.Instant;

public class Message {
    private String message;
    private User author;
    private Instant timestamp;
    private Integer id;

    public String getMessage() { return this.message; }
    public User getAuthor() { return this.author; }
    public Instant getTimestamp() { return this.timestamp; }
    public Integer getId() { return this.id; }

    public Message(User Author, String Message) {
        author = Author;
        message = Message;
        timestamp = Instant.now();
        id = MessageId.getNextId();
        Wall.addMessage(this);
    }
}
