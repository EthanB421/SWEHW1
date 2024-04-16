package hwk6;

import java.util.ArrayList;
import java.util.Iterator;

public class ChatHistory implements IterableByUser {
    private ArrayList<Message> messageHistory;
    private ArrayList<Message> receivedHistory;

    public ChatHistory()
    {
        this.messageHistory = new ArrayList<>();
        this.receivedHistory = new ArrayList<>();
    }

    public ChatHistory(ChatHistory ch)
    {
        this.messageHistory = new ArrayList<>();
        for(Message message : ch.messageHistory)
        {
            this.messageHistory.add(message);
        }
    }

    public void addMessage(Message message){
        messageHistory.add(message);
    }

    public void addReceived(Message message){
        receivedHistory.add(message);
    }

    public void lastMessage()
    {
        if(messageHistory.size()!=0){
        System.out.println(messageHistory.get(messageHistory.size()-1));
        }else{
            System.out.println("");
        }
    }

    public ArrayList<Message> getHistory(){
        return this.messageHistory;
    }

    public void printHistory()
    {
        int counter = 1;
        System.out.println("----------------------Messages Sent--------------------------------");
        for(Message text : messageHistory)
        {
            System.out.println("Message "+counter+": "+text.getText());
            counter++;
        }
        System.out.println("--------------------Messages Received---------------------------");
        if(this.receivedHistory!=null)
        {
            for(Message text : receivedHistory)
            {
                System.out.println("From "+text.getSender()+": "+text.getText());
            }
        }else
        {
            System.out.println("Empty");
        }
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return new SearchMessagesByUser(messageHistory, userToSearchWith);
    }
}

