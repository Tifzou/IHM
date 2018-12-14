package insa.ihm;

public class BaseMessage {
    String message;
    private User sender;
    private long createdAt;

    public String getMessage() {
        return message;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public User getSender() {
        return sender;
    }
}
class User {
    String nickname;
    String id;

    public String getUserId() {
        return id;
    }
}

class UserMessage extends BaseMessage{
}