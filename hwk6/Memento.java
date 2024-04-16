package hwk6;

public class Memento {
    private ChatHistory state;
    public Memento(ChatHistory state)
    {
        this.state = state;
    }

    public ChatHistory getState(){
        return state;
    }

    public void setState(ChatHistory newState)
    {
        this.state = new ChatHistory(newState);
    }
}
