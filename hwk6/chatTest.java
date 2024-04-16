package hwk6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class chatTest {

    private User sender;
    private User recipient;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private Message message;

    @Before
    public void setUp() {
        chatServer = new ChatServer();
        sender = new User("Sender", chatServer);
        recipient = new User("Recipient", chatServer);
        chatHistory = new ChatHistory();
        message = new Message("Test message", sender, new ArrayList<>(List.of(recipient)));
    }


    @Test
    public void testAddMessageToHistory() {
        chatHistory.addMessage(message);
        
        assertEquals(1, chatHistory.getHistory().size());
        assertEquals(message.getText(), chatHistory.getHistory().get(0).getText());
    }

    @Test
    public void testRetrieveChatHistory() {
        chatHistory.addMessage(message);
        
        assertEquals(1, chatHistory.getHistory().size());
        assertEquals(message.getText(), chatHistory.getHistory().get(0).getText());
    }
}
