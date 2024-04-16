package hwk6;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Message {
    private Timestamp currentTime;
    private String text;
    private User sender;
    private ArrayList<User> recipients;

    public Message(String text, User sender, ArrayList<User> recipients)
    {
        this.currentTime = new Timestamp(System.currentTimeMillis());
        this.text = text;
        this.sender = sender;
        this.recipients = recipients;
    }

    public String getText() {
        return text+currentTime;
    }

    public String getSender() {
        return this.sender.getName();
    }

    public User getSenderObject() {
        return this.sender;
    }
    public ArrayList<User> getRecipients() {
        return this.recipients;
    }

}
