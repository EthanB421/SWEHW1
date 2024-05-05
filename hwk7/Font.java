package hwk7;

public class Font {
    
    private String font;
    
    public Font(String font) {
        this.font = font;
}

    public String printFont()
    {
       return "Font: "+this.font;
    }

    public String getFont()
    {
        return this.font;
    }
}
