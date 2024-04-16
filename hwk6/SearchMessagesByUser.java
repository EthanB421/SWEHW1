package hwk6;

import java.util.Iterator;
import java.util.List;

class SearchMessagesByUser implements Iterator<Message> {
    private final Iterator<Message> iterator;

    public SearchMessagesByUser(List<Message> messages, User searchedUser) {
        this.iterator = messages.stream()
            .filter(m -> m.getSender().equals(searchedUser.getName()) || m.getRecipients().contains(searchedUser.getName()))
            .iterator();
    }

    @Override
    public Message next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }


}