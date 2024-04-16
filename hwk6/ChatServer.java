package hwk6;

import java.util.ArrayList;
import java.util.List;
public class ChatServer  {
    private ArrayList<User> users;
    private ArrayList<User> blockedUsers;

    private Message message;

    public ChatServer(){
        users = new ArrayList<>();
        blockedUsers = new ArrayList<>();
    }

    public void addUser(User user)
    {
        this.users.add(user);
        System.out.println(user.getName()+" added!");
    }

    public void addBlockee(User user)
    {
        this.blockedUsers.add(user);
        System.out.println(user.getName()+" blocked from sending messages!");
    }

    public ArrayList<User> removeUser(User user)
    {
        this.users.remove(user);
        return this.users;
    }

    public void sendMessage(Message message) {
        
        if(blockedUsers.contains(message.getSenderObject()))
        {
            System.out.println("Message blocked");
        }else{
        for (User recipient : message.getRecipients()) {
            System.out.println("------------");
            recipient.openMessage(message);
            System.out.println("Sent to: "+recipient.getName());
            System.out.println("------------");
        }
    }
    }
}
