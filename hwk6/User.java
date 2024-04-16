package hwk6;

import java.util.ArrayList;
import java.util.Iterator;

public class User implements IterableByUser {
    private String name;
    private ChatServer mediator;
    private ChatHistory history;
    private Memento memento;

    public User(String name, ChatServer mediator)
    {
        this.name = name;
        this.mediator = mediator;
        this.history = new ChatHistory();
        this.memento = new Memento(this.history);
    }

    public String getName()
    {
        return this.name;
    }

    public void sendMessage(String content, ArrayList<User> recipients)
    {
        Message message = new Message(content, this, recipients);
        mediator.sendMessage(message);
        history.addMessage(message);
    }

    public void openMessage(Message message)
    {
        System.out.println(message.getSender() + " says: "+ message.getText());
        history.addReceived(message);
    }
    
    public void getHistory()
    {
        System.out.println("======================"+this.name+"'s CHAT HISTORY==================");
        history.printHistory();
    }

    public void saveHistory()
    {
        memento.setState(history);
    }

    public void undo()
    {
     this.history = memento.getState();  
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return history.iterator(userToSearchWith);
    }
}

