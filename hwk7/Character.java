package hwk7;


public class Character {
    private char character;
    private Font font;
    private Color color;
    private Size size;

    public Character(char character, String font, String color, int size)
    {
        this.character = character;
        this.font = AttributeFactory.initFactory().getFont(font);
        this.color = AttributeFactory.initFactory().getColor(color);
        this.size = AttributeFactory.initFactory().getSize(size);
    }

    public void printChar()
    {
        System.out.println("Character: "+this.character+ "| "+this.font.printFont()+" | "+this.color.printColor()+ " | "+this.size.printSize());
    }

    public char getCharacter()
    {
        return this.character;
    }

    public Font getFont()
    {
        return this.font;
    }

    public Color getColor()
    {
        return this.color;
    }

    public Size getSize()
    {
        return this.size;
    }
}
