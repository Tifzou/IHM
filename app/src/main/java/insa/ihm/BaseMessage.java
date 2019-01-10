package insa.ihm;

public class BaseMessage {
    protected String message;
    protected User sender;
    protected long createdAt;
    protected boolean belongsToCurrentUser; // is this message sent by us?

    public BaseMessage(String text) {
        this.message = text;
        this.belongsToCurrentUser = false;
    }
    public String getMessage() {
        return message;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public User getSender() {
        return sender;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
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
    public UserMessage(String text) {
        super(text);
        this.belongsToCurrentUser = true;
    }
}