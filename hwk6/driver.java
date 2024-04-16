package hwk6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class driver {
    public static void main(String[] args) {
        ChatServer chatroom1 = new ChatServer();
        User ethan = new User("ethan", chatroom1);
        User mike = new User("mike", chatroom1);
        User jay = new User("jay", chatroom1);
        ethan.sendMessage("Hello mike and jay  ", new ArrayList<>(Arrays.asList(mike, jay)));
        chatroom1.addBlockee(mike);
        mike.sendMessage("this is for ethan og  ", new ArrayList<>(Arrays.asList(ethan)));
        ethan.saveHistory();
        ethan.getHistory();
        ethan.sendMessage("Hello jay  ", new ArrayList<>(Arrays.asList(jay)));
        ethan.undo();
        ethan.getHistory();
        mike.getHistory();
        
    System.out.println("Messages received by mike from ethan:");
    Iterator<Message> it = mike.iterator(new User("ethan", chatroom1));
    while (it.hasNext()) {
        Message message = it.next();
        System.out.println("From "+message.getSender()+": "+message.getText());
    }
    }
}
