package hwk7;

public class Size {
    private int size;

    public Size(int size)
    {
        this.size = size;
    }

    public int getSize()
    {
        return size;
    }
    public String printSize()
    {
        return "Font size: "+this.size;
    }

}
